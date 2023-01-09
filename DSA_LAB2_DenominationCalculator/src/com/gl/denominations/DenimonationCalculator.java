package com.gl.denominations;



public class DenimonationCalculator {

	private int[] denominations;
	private int amount;
	
	private boolean outcome;
	
	public DenimonationCalculator(int[] denominations,int amount )
	{
		this.denominations=denominations;
		this.amount=amount;
	}

	public int[] getDenominations() 
	{
		return denominations;
	}

	public void setDenominations(int[] denominations)
    {
		this.denominations = denominations;
	}

	public int getAmount()
	{
		return amount;
	}

	public void setAmount(int amount)
	{
		this.amount = amount;
	}

	public boolean isOutcome() 
	{
		return outcome;
	}

	public void setOutcome(boolean outcome)
	{
		this.outcome = outcome;
	}

	
	public void CaculateDenimination()
	{
	   performSort();
	       
        StringBuilder result = new StringBuilder();
        result.append(String.format(
                "Amount to pay : %d", amount));
        result.append(System.getProperty("line.separator"));
       
        int tempAmount = amount;
       
        try {
       
            for (int index=0; index < denominations.length; index++) 
            {
               
                int denominationValue = denominations[index];
 
                int quotient = tempAmount / denominationValue;
                int remainder = tempAmount % denominationValue;        
               
                if (quotient == 0)
                {
                    // This denomination cannot be considered for the final outcome
                }
                else 
                {
                               
                    result.append(String.format(
                        "Denomination : %d, Count : %d",
                        denominationValue, quotient));
                    result.append(System.getProperty("line.separator"));
 
                    tempAmount = remainder;
                }
               
                if (remainder == 0) 
                {
                    this.outcome = true;
                    break;
                }
            }  
           
        }
        catch (ArithmeticException arithmeticException) {
            arithmeticException.printStackTrace();
        }
       
	        if (outcome)
	        {
	           
	            System.out.println("Success");
	            System.out.println(result);
	        }
	        else 
	        {
	            System.out.println("Failure");
	            result.append(String.format(
	                    "Unable to provide denomination for the balance amount of %d",
	                    tempAmount));
	            System.out.println(result);
	        }

		
	}

	public void performSort()
	{
        MergeSortDesc descSorter = new MergeSortDesc();
        descSorter.sortDesc(denominations, 0, denominations.length - 1);
    }

	
}
