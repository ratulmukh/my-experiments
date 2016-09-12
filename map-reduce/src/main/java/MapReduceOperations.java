package ratul.myexperiments;

import java.util.List;
import scala.Tuple2;

interface MapReduceOperations<K1,V1, K2, V2> {
    List<Tuple2<K2, V2>> map(K1 k1, V1 v1);
    
    List<V2> reduce(K2 k2, List<V2> v2List);
}