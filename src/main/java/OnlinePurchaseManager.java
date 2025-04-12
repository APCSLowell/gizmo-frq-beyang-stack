import java.util.ArrayList;
public class OnlinePurchaseManager
{
  /** An ArrayList of purchased Gizmo objects,
  * instantiated in the constructor.
  */
  private ArrayList<Gizmo> purchases;
  
  /** Returns the number of purchased Gizmo objects that are electronic
  * whose manufacturer is maker, as described in part (a).
  */
  public int countElectronicsByMaker(String maker)
  {
    int a = 0;
    for(int i = 0; i < purchases.size(); i++){
      if(purchases[i].isElectronic() && purchases[i].getMaker().equals(maker))
        a++;
    }
    return a;
  }
  
  /** Returns true if any pair of adjacent purchased Gizmo objects are
  * equivalent, and false otherwise, as described in part (b).
  */
  public boolean hasAdjacentEqualPair()
  {
    if(purcahses.size() < 2)
      return false;
    for(int i = 0; i < purchases.size(); i++){
      if(purchases[i].equals(purchases[i-1]))
        return true;
    }
    return false;
  }
  public OnlinePurchaseManager()
  {
    purchases = new ArrayList <Gizmo>();
  }
  public void add(Gizmo g)
  {
    purchases.add(g);
  }
}
