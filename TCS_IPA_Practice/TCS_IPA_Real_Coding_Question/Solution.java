import java.util.*;
class Asset {
	private int assetId;
	private String assetType;
	private double price;
	private Brand brand;
	public Asset(int assetId, String assetType, double price, Brand brand) {
		this.assetId = assetId;
		this.assetType = assetType;
		this.price = price;
		this.brand = brand;
	}
	public int getAssetId() {
		return assetId;
	}
	public String getAssetType() {
		return assetType;
	}
	public double getPrice() {
		return price;
	}
	public Brand getBrand() {
		return brand;
	}
}
class Brand {
	private int brandId;
	private String brandName;
	private int warrantyYears;
	public Brand(int brandId, String brandName, int warrantyYears) {
		this.brandId = brandId;
		this.brandName = brandName;
		this.warrantyYears = warrantyYears;
	}
	public int getBrandId() {
		return brandId;
	}
	public String getBrandName() {
		return brandName;
	}
	public int getWarrantyYears() {
		return warrantyYears;
	}
}
class Solution {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		if(n <= 0) {
			System.out.println("Please enter more items...");
			return;
		}
		Asset[] asset = new Asset[n];
		for(int i = 0; i < n; i++) {
			int assetId = Integer.parseInt(sc.nextLine().trim());
			String assetType = sc.nextLine().trim();
			int price = Integer.parseInt(sc.nextLine().trim());
			int brandId = Integer.parseInt(sc.nextLine().trim());
			String brandName = sc.nextLine().trim();
			int warrantyYears = Integer.parseInt(sc.nextLine().trim());
			Brand brand = new Brand(brandId, brandName, warrantyYears);
			asset[i] = new Asset(assetId, assetType, price, brand);
		}
		String inputAT = sc.nextLine().trim();
		int maxWY = Integer.parseInt(sc.nextLine().trim());

		Asset[] res = getResult(asset, inputAT, maxWY);
		System.out.println("Output: ");
		boolean found = false;
		for(int i = 0; i < n; i++) {
			if(res[i] != null) {
				found = true;
				System.out.println(res[i].getAssetId());
				System.out.println(res[i].getAssetType());
				System.out.println(res[i].getBrand().getBrandId());
				System.out.println(res[i].getBrand().getBrandName());
				System.out.println(res[i].getBrand().getWarrantyYears());
			}
		}
		if(!found) {
			System.out.println("No items found");	
		}
	}
	public static Asset[] getResult(Asset[] asset, String inputAT, int maxWY) {	
		int n = asset.length;
		int k = 0;
		Asset[] res = new Asset[n];
		for(int i = 0; i < n; i++) {
			if(inputAT.equalsIgnoreCase(asset[i].getAssetType()) && maxWY <= asset[i].getBrand().getWarrantyYears()) {
				res[k] = asset[i];
				k++;
			}
		}
		return res;
 	}
}