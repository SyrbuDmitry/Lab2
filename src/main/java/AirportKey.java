import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AirportKey implements WritableComparable<AirportKey> {

    private int AIRPORT_ID, source;

    public void write(DataOutput out) throws IOException{
        out.writeInt(AIRPORT_ID);
        out.writeInt(source);
    }

    public void readFields(DataInput in) throws IOException{
        AIRPORT_ID = in.readInt();
        source = in.readInt();
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
