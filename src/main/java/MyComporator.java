import org.apache.hadoop.io.RawComparator;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class MyComporator extends WritableComparator {
    protected MyComporator(){
        super(AirportKey.class, true);
    }
    @Override
    public int compare(WritableComparable wc1, WritableComparable wc2) {
         AirportKey a = (AirportKey)wc1;
         AirportKey b = (AirportKey)wc2;
         return a.compareTo(b);
    }
}
