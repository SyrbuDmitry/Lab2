import org.apache.hadoop.io.RawComparator;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class MyComporator extends WritableComparator {
    @Override
    public int compare(WritableComparable wc1, WritableComparable wc2) {

         return 1;
    }
}
