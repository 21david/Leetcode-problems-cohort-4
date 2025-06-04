class Solution {
	
      public String countOfAtoms(String formula) {
        // Produces correct output, but does not pass time limit constraint
        // 24/28 test cases passed
    	
    	  String[] input = toStringArray(formula);

        Stack<Integer> multiplierStack = new Stack<>();
        
        Stack<StringBuilder> stringStack = new Stack<>();
        
        int mul = 1;
        
        StringBuilder temp1 = new StringBuilder();
        StringBuilder temp2 = new StringBuilder();
        
        for(int i = 0; i < input.length; i++)
        {
        	String s = input[i];
        	
        
        	if(Character.isDigit(s.charAt(0))) // if digit, then we begin working on a new layer
            {
                // put the number into multiplierStack
                multiplierStack.push(Integer.parseInt(s)); 

                // put whatever we were working on into stringStack
                stringStack.push(temp1);

                // start over for the new layer
                temp1 = new StringBuilder();
                
                
                // this is for the case where a single element is multiplied (i.e '12Mg', instead of '12(MgHe)' )
                if(input[i + 1].charAt(0) == '(') // peek at the next element in input
                	continue;
                else // else, this digit is trying to multiply a single element
                {
                	String element = input[i + 1];
                	
                    mul = multiplierStack.pop();
                    
                    temp2 = new StringBuilder(element);
                    for(int j = 1; j < mul; j++)
                        temp1.append(temp2);
                    

                    temp1 = stringStack.pop().append(temp1);
                    
                }
                
            }
            else if(s.charAt(0) == '(')
            {
                continue;
            }
            else if(s.charAt(0) == ')') // pop a number, multiply the current string by that number
            {
                // get multiplier
            	if(multiplierStack.size() == 0)
            		continue;
            	else
            	{
            		mul = multiplierStack.pop();

	                // multiply string
	                temp2 = new StringBuilder(temp1.toString());
	                for(int j = 1; j < mul; j++)
	                    temp1.append(temp2);
	
	                // take whatever we had in the last layer, and add
	                // the current value of temp1 to it
	                // (basically, we're "going back a layer")
	                temp1 = stringStack.pop().append(temp1);
            	}
            }
            else // else it's an element
            {
                // add the name of the element to the string representing the current layer (temp1)
                temp1.append(s);
            }
        }
        
        
    	return countElements(temp1.toString());
    }
    
    
    
	/*
	 * Converts a formula into a string array, where each number, each element, and each parenthesis is its own element
	 * It also reverses every element
	 * Example:
	 *    input: Mg12(He3)2
	 *    output: {"2", "(", "3", "He", ")", "12", "Mg"}
	 */
	public String[] toStringArray(String formula)
	{
		ArrayList<String> arrayList = new ArrayList<>();
		
		for(int i = 0; i < formula.length(); i++)
		{
			char cur = formula.charAt(i);
			
			if(Character.isLetter(cur))  // if its an element
			{
				int start = i;
				i++;
				
				while(i < formula.length() && Character.isLowerCase(formula.charAt(i)))
					i++;
				
				String element = formula.substring(start, i);
				
				i--;
				
				arrayList.add(element);
			}
			else if(Character.isDigit(cur))  // if its a digit
			{
				int start = i;
				i++;
				
				while(i < formula.length() && Character.isDigit(formula.charAt(i)))
					i++;
				
				String number = formula.substring(start, i);
				
				i--;
				
				arrayList.add(number);
			}
			else if(cur == '(')  // if its parenthesis
			{
				arrayList.add(")"); // add the opposite to make reversing easier
			}
			else if(cur == ')')
			{
				arrayList.add("("); // add the opposite to make reversing easier
			}
			
			
		}
	
	//	System.out.println(arrayList);
		
		// reverse and put into String[] array
		String[] array = new String[arrayList.size()];
		for(int i = 0; i < arrayList.size(); i++)
			array[i] = arrayList.get(arrayList.size() - 1 - i);
		if(arrayList.size() % 2 == 1)  // if odd, then the for loop above skipped the middle element
			array[array.length / 2] = arrayList.get(array.length / 2);
		
	//	System.out.println(Arrays.deepToString(array));
		
		return array;
	}
	
    
    public String countElements(String expandedInput)
    {
    	TreeMap<String, Integer> map = new TreeMap<>();
    	
    	int i = 0;
    	
    	while(i < expandedInput.length())
    	{
    		int start = i;
    		i++;
    		
    		while(i < expandedInput.length() && Character.isLowerCase(expandedInput.charAt(i)))  // this will stop at the next upper case letter (the next element)
    			i++;
    		
    		String element = expandedInput.substring(start, i);
    		
    		map.put(element, map.getOrDefault(element, 0) + 1);
    	}
    	
    	
    	// convert to a string
    	StringBuilder sb = new StringBuilder();
    	
    	Iterator it = map.keySet().iterator();
    	
    	while(it.hasNext()) {
    		String next = (String) it.next();
    		
    		sb.append(next);
    		if(map.get(next) != 1)
    			sb.append(map.get(next));
    	}
    	
    	return sb.toString();
    }
}
