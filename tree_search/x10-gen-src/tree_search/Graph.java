package tree_search;


@x10.runtime.impl.java.X10Generated
public class Graph extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Graph> $RTT = 
        x10.rtt.NamedType.<Graph> make("tree_search.Graph",
                                       Graph.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(tree_search.Graph $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Graph.class + " calling"); } 
        $_obj.list = $deserializer.readObject();
        $_obj.vertices = $deserializer.readInt();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        tree_search.Graph $_obj = new tree_search.Graph((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.list);
        $serializer.write(this.vertices);
        
    }
    
    // constructor just for allocation
    public Graph(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 6 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Graph.x10"
    public x10.core.Rail<tree_search.Node> list;
    
    //#line 7 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Graph.x10"
    public int vertices;
    
    
    //#line 9 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Graph.x10"
    public void Graph(final int v) {
        
        //#line 11 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Graph.x10"
        this.vertices = v;
    }
    
    
    //#line 17 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Graph.x10"
    public void addEdge(final int s, final int d, final int w) {
        
    }
    
    
    //#line 5 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Graph.x10"
    final public tree_search.Graph tree_search$Graph$$this$tree_search$Graph() {
        
        //#line 5 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Graph.x10"
        return tree_search.Graph.this;
    }
    
    
    //#line 5 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Graph.x10"
    // creation method for java code (1-phase java constructor)
    public Graph() {
        this((java.lang.System[]) null);
        tree_search$Graph$$init$S();
    }
    
    // constructor for non-virtual call
    final public tree_search.Graph tree_search$Graph$$init$S() {
         {
            
            //#line 5 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Graph.x10"
            
            
            //#line 5 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Graph.x10"
            this.__fieldInitializers_tree_search_Graph();
        }
        return this;
    }
    
    
    
    //#line 5 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Graph.x10"
    final public void __fieldInitializers_tree_search_Graph() {
        
        //#line 5 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Graph.x10"
        this.list = null;
        
        //#line 5 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Graph.x10"
        this.vertices = 0;
    }
}

