import io.dajac.kfn.invoker.Function;
import io.dajac.kfn.invoker.KeyValue;

public class MyFunction implements Function<byte[], byte[], byte[], byte[]> {
    @Override
    public KeyValue<byte[], byte[]> apply(byte[] key, byte[] value) {
        // Do something here!
        return KeyValue.pair(key, value);
    }
}