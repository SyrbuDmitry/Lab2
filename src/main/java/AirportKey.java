import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AirportKey implements WritableComparable<AirportKey> {
    private IntWritable AIRPORT_ID, source;
    public void readFields(DataInput in) throws IOException{
        AIRPORT_ID.readFields(in);
        source.readFields(in);
    }
    public void write(DataOutput out) throws IOException{
        AIRPORT_ID.write(out);
        source.write(out);
    }
    public int compareTo(AirportKey obj){
        return this.AIRPORT_ID.compareTo(obj.AIRPORT_ID);
    }
    public void setSource(int source){
        this.source=(IntWritable)source;
    }
}
