import org.apache.hadoop.io.RawComparator;
import org.apache.hadoop.io.WritableComparable;

public class MyComporator implements RawComparator {
     int compare(WritableComparable a,WritableComparable b) {
        return 1;
    }
}
