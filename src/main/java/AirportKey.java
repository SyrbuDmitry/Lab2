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
        int r = compare(AIRPORT_ID, obj.AIRPORT_ID);
        if (r!=0)
            return r;
        else
            return compare(source, obj.source);
    }

    public int compare(int a, int b){
        return Integer.compare(a,b);
    }
    public AirportKey(){
    }

    public AirportKey(int id, int s){
        AIRPORT_ID=id;
        source=s;
    }
    public int getID(){
        return AIRPORT_ID;
    }
}
