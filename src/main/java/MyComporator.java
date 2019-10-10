import org.apache.hadoop.io.RawComparator;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class MyComporator extends WritableComparator {
    @Override
     public int compare(AirportKey a,AirportKey b) {
        return a.compareTo(b);
    }
}
