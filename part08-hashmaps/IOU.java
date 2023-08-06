
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RM
 */
public class IOU {
    private HashMap<String, Double> map;

    public IOU() {
        this.map = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        this.map.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        if (this.map.containsKey(toWhom)) {
            return this.map.get(toWhom);
        } else {
            return 0;
        }
    }
}
