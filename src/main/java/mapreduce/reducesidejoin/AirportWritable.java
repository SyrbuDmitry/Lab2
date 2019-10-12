package mapreduce.reducesidejoin;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AirportWritable implements Writable {
    private Text description;
    public void readFields(DataInput in) throws IOException{
        description.readFields(in);
    }
    public void write(DataOutput out) throws IOException{
        description.write(out);
    }
    public void setDescription(String description){
        this.description=new Text(description);
    }
}
