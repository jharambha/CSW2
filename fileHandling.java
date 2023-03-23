package csw2;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;

public class fileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			File inputFile=new File("C:\\Users\\Ayachi\\Downloads\\csvfile.csv");  
			
		FileInputStream fis=new FileInputStream(inputFile);     
	
		
		BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Ayachi\\Downloads\\csvfile.csv"));
		String str;

		List<String> list = new ArrayList<String>();
		while((str = in.readLine()) != null){
		    list.add(str);
		}
		
		
		HashMap<String,Integer> map = new HashMap<>();
		
		for(int n =0;n<list.size();n++) {
		    String s = list.get(n).replace(',', ' ');
		    
		    String sub =s.substring(11, 36).replace('1', ' ');
		   
		    int x=Integer.parseInt(s.substring(0, 10));
			map.put(sub,x);
			
		}
		
		HashMap<String, Integer> sortedmap
        = map.entrySet() .stream().sorted((i1, i2)-> i1.getValue().compareTo(i2.getValue())) 
        .collect(Collectors.toMap( Map.Entry::getKey,Map.Entry::getValue,(e1, e2) -> e1, LinkedHashMap::new));
		
		
		 File outputFile = new File("C:\\Users\\Ayachi\\Documents\\output.txt");
		  
	        BufferedWriter bf = new BufferedWriter(new FileWriter(outputFile));
  
            
            for (Map.Entry<String, Integer> entry :sortedmap.entrySet()) {
                 bf.write(entry.getKey() + " "+ entry.getValue());
                 bf.newLine();
            }
            bf.flush();
            
          
		}  
		catch(Exception e)  
		{  
			System.out.println(e);
		}  
		}  
	}


