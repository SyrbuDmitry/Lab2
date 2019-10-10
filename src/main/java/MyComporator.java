import org.apache.hadoop.io.RawComparator;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class MyComporator extends WritableComparator {
    @Override
    public int compare(WritableComparable a, WritableComparable b)  {
        return (AirportKeya.compareTo(b);
    }
}
