import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AirportWritable implements Writable {
    private IntWritable code;
    private Text description;
    public void readFields(DataInput in) throws IOException{
        code.readFields(in);
        description.readFields(in);
    }
    public void write(DataOutput out) throws IOException{
        code.write(out);
        description.write(out);
    }
}
