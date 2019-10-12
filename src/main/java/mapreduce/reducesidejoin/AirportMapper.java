

package mapreduce.reducesidejoin;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.io.Text;
import java.io.IOException;



public class AirportMapper extends Mapper<LongWritable, Text, AirportKey, Text> {
    private static int DESCRIPTION=1, COLUMN_NAME=0;

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String columns[] = CsvParser.parseIDString(value);
        if(CsvParser.checAirportLine(columns[COLUMN_NAME]))
            return;
        AirportKey airKey = new AirportKey(CsvParser.getID(columns[COLUMN_NAME]),0);
        Text description = new Text(columns[DESCRIPTION]);
        context.write(airKey,description);
    }
}