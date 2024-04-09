public class Phrase 
{ 

    private String currentPhrase; 

    public Phrase(String p) 
    { 
        currentPhrase = p; 
    } 

    public int findNthOccurrence(String str, int n) 
    {
        int occurrence = 0;
        for(int i=0; i<currentPhrase.length(); i++)
        {
            if( i+str.length() < currentPhrase.length() )
            {
                if( currentPhrase.substring(i,i+str.length()).equals(str) )
                {
                    occurrence++;
                    if( occurrence == n )
                        return i;
                }
            }
        }
        return -1;
    }
    
    public void replaceNthOccurrence(String str, int n, String repl) 
    {
        int index = findNthOccurrence(str, n);

        if (index != -1) {
            currentPhrase = currentPhrase.substring(0, index) + repl + currentPhrase.substring(index + str.length());
        }
    }

    public int findLastOccurrence(String str) 
    {
        int occurrence = 1;
        int index = -1;

        while(findNthOccurrence(str, occurrence) != -1) {
            index = findNthOccurrence(str, occurrence);
            occurrence++;
        }

        return index;
    }

    public String toString() 
    { 
      return currentPhrase;
    } 

}
