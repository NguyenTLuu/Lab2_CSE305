import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type (permanent / long term / short term): ");
        String type = sc.nextLine();
        ContractBuilder builder = null;
        switch (type) {
            case "permanent":
                builder = new Permanent();
                break;
            case "long term":
                builder = new LongTerm();
                break;
            case "short term":
                builder = new ShortTerm();
                break;
        }

        System.out.println("Enter the contract id: ");
        String contractId = sc.nextLine();
        System.out.println("Enter the rent amount: ");
        int rentAmount = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the tenant id: ");
        String tenantId = sc.nextLine();
        System.out.println("Enter the property id: ");
        String propertyId = sc.nextLine();

        Client c1 = new Client();
        Contract contract = c1.requestCreateContract(builder, contractId, rentAmount, tenantId, propertyId, type);
        System.out.println(contract);

        System.out.println("Normal document (1) or Confidential document(2)? Choose 1 or 2");
        int typedoc = sc.nextInt();
        if (typedoc == 1) {
            new Extension().saveFile(contract);
        } else {
            new AES_Encryption(contract);
        }


    }
}
