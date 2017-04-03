package tdd;

/**
 * taken from here https://zeroturnaround.com/rebellabs/why-your-next-cloud-app-will-probably-suck-without-unit-testing/
 */
public class BasketWeightCalculator {
	private int totalWeight = 0;
	
	public void addItem(int itemWeight) {
		totalWeight += itemWeight;
		if(totalWeight < 0){
			totalWeight = 0;
		}
	}
	
	// suppose someone change the addItem if totalWeight < 0 then set totalWeight to 1, then in test should return failure
	public void addItem2(int itemWeight) {
		totalWeight += itemWeight;
		if(totalWeight < 0){
			totalWeight = 1;
		}
	}

	public int getTotalWeight() {
		return totalWeight;
	}
	
	public void setTotalWeight(int totalWeight) {
		this.totalWeight = totalWeight;
	}
}
