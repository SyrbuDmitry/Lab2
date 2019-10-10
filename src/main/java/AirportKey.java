import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AirportKey implements WritableComparable<AirportKey> {
    private Text AIRPORT_ID;
    private IntWritable  source;
    @Override
    public void readFields(DataInput in) throws IOException{
        source.readFields(in);
        AIRPORT_ID.readFields(in);
    }
    @Override
    public void write(DataOutput out) throws IOException{
        AIRPORT_ID.write(out);
        source.write(out);
    }
    public int compareTo(AirportKey obj){
        int r = this.AIRPORT_ID.compareTo(obj.AIRPORT_ID);
        if (r!=0)
            return r;
        else
            return this.source.compareTo(obj.source);
    }
    public AirportKey(){
    }

    public AirportKey(Text id, IntWritable s){
        AIRPORT_ID=id;
        source=s;
    }
    public int getID(){
        int id=Integer.parseInt(AIRPORT_ID.toString());
        return id;
    }
}
