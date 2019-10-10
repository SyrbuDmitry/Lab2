import org.apache.hadoop.io.RawComparator;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class MyComporator extends WritableComparator {
    @Override
    public int compare(AirportKey wc1, AirportKey wc2) {
         AirportKey a = (AirportKey)wc1;
         AirportKey b = (AirportKey)wc2;
         return a.compareTo(b);
    }
}
