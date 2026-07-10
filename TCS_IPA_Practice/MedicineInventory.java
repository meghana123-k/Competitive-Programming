package TCS_IPA_Practice;

import java.util.Scanner;

class Medicine {
    private int medicineId;
    private String medicineName;
    private int expiryYear;
    private double price;

    public Medicine(int medicineId, String medicineName, int expiryYear, double price) {
        this.medicineId = medicineId;
        this.medicineName = medicineName;
        this.expiryYear = expiryYear;
        this.price = price;
    }

    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public void setExpiryYear(int expiryYear) {
        this.expiryYear = expiryYear;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMedicineId() {
        return this.medicineId;
    }

    public String getMedicineName() {
        return this.medicineName;
    }

    public int getExpiryYear() {
        return this.expiryYear;
    }

    public double getPrice() {
        return this.price;
    }
}

public class MedicineInventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Medicine medicines[] = new Medicine[4];
        for (int i = 0; i < 4; i++) {
            String[] input = sc.nextLine().trim().split(" ");
            medicines[i] = new Medicine(Integer.parseInt(input[0]), input[1].trim(), Integer.parseInt(input[2]),
                    Double.parseDouble(input[3]));
        }
        String medicineInput = sc.nextLine().trim();
        int result = countMedicinesByMedicineName(medicines, medicineInput);
        if (result == 0) {
            System.out.println("No medicines found with that name.");
        } else {
            System.out.println(result);
        }
        sc.close();
    }

    public static int countMedicinesByMedicineName(Medicine[] medicines, String medicineName) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (medicineName.equalsIgnoreCase(medicines[i].getMedicineName())) {
                count++;
            }
        }
        return count;
    }
}
