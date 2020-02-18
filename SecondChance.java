import java.util.ArrayList;
import java.util.Collections;


public class SecondChance {
int hit =0 ; 
int pageFault =0 ; 
	
	public SecondChance(int size , ArrayList<Integer> referenceString) {
frame Frame = new frame(size ) ;
ArrayList<Integer> FrameBitlist = new ArrayList<Integer>(Collections.nCopies(size, 0));
ArrayList<Integer> agelist = new ArrayList<Integer>();

for(int i=0 ; i<referenceString.size() ; i++)
{
	if(!Frame.isFull&&!Frame.frameList.contains(referenceString.get(i)))
	{
		Frame.addToFrame(referenceString.get(i));
		agelist.add(i);
		pageFault++ ;
	}
	

	else if ( Frame.frameList.contains(referenceString.get(i)))
	{
	hit ++ ; 
	FrameBitlist.set(Frame.frameList.indexOf(referenceString.get(i)), 1) ; 
	}
	else 
	{
	for(int k=0 ; k<referenceString.size() ; k++)
	{
		if(agelist.contains(k))
		{
			 
			if(FrameBitlist.get(agelist.indexOf(k))==0)
			{
				
				Frame.frameList.set(agelist.indexOf(k), referenceString.get(i)) ;
				agelist.set(agelist.indexOf(k), i) ;
				pageFault ++ ;
				break ; 
			}
			else
			{
				FrameBitlist.set(agelist.indexOf(k),0);
			}
			
		}
		
		
	}
		
	
	}
	System.out.print("\t");
	for(int Z =0 ; Z<Frame.frameList.size() ; Z++)
	{
		System.out.print(Frame.frameList.get(Z)+"\t");
		
	}
	System.out.println();
	System.out.print("Second chance bit: " );
	for(int Z =0 ; Z<Frame.frameList.size() ; Z++)
	{
	System.out.print(FrameBitlist.get(Z)+"\t") ; 
	}
	
	
	System.out.println();
	}




}


public static void main(String[] args) {
	
	ArrayList<Integer> ref = new ArrayList<Integer>();  
	
	ref.add(0) ; 
	ref.add(4) ;
	ref.add(1) ;
	ref.add(4) ;
	ref.add(2) ;
	ref.add(4) ;
	ref.add(3) ;
	ref.add(4) ;
	ref.add(2) ;
	ref.add(4) ;
	ref.add(0) ;
	ref.add(4) ;
	ref.add(1) ;
	ref.add(4) ;
	ref.add(2) ;
	ref.add(4) ;
	ref.add(3) ;
	ref.add(4) ;
SecondChance sc = new SecondChance(3, ref) ;
System.out.println("there is " +sc.pageFault+" page faults ");
}

}
