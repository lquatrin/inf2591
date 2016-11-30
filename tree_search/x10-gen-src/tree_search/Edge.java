package tree_search;

@x10.runtime.impl.java.X10Generated
public class Edge extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Edge> $RTT = 
        x10.rtt.NamedType.<Edge> make("tree_search.Edge",
                                      Edge.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(tree_search.Edge $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Edge.class + " calling"); } 
        $_obj.destination = $deserializer.readInt();
        $_obj.source = $deserializer.readInt();
        $_obj.weight = $deserializer.readInt();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        tree_search.Edge $_obj = new tree_search.Edge((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.destination);
        $serializer.write(this.source);
        $serializer.write(this.weight);
        
    }
    
    // constructor just for allocation
    public Edge(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 4 "F:/GitHub/inf2591/tree_search/src/tree_search/Edge.x10"
    public int source;
    
    //#line 5 "F:/GitHub/inf2591/tree_search/src/tree_search/Edge.x10"
    public int destination;
    
    //#line 6 "F:/GitHub/inf2591/tree_search/src/tree_search/Edge.x10"
    public int weight;
    
    
    //#line 7 "F:/GitHub/inf2591/tree_search/src/tree_search/Edge.x10"
    public void Edge(final int s, final int d, final int w) {
        
        //#line 8 "F:/GitHub/inf2591/tree_search/src/tree_search/Edge.x10"
        this.source = s;
        
        //#line 9 "F:/GitHub/inf2591/tree_search/src/tree_search/Edge.x10"
        this.destination = d;
        
        //#line 10 "F:/GitHub/inf2591/tree_search/src/tree_search/Edge.x10"
        this.weight = w;
    }
    
    
    //#line 3 "F:/GitHub/inf2591/tree_search/src/tree_search/Edge.x10"
    final public tree_search.Edge tree_search$Edge$$this$tree_search$Edge() {
        
        //#line 3 "F:/GitHub/inf2591/tree_search/src/tree_search/Edge.x10"
        return tree_search.Edge.this;
    }
    
    
    //#line 3 "F:/GitHub/inf2591/tree_search/src/tree_search/Edge.x10"
    // creation method for java code (1-phase java constructor)
    public Edge() {
        this((java.lang.System[]) null);
        tree_search$Edge$$init$S();
    }
    
    // constructor for non-virtual call
    final public tree_search.Edge tree_search$Edge$$init$S() {
         {
            
            //#line 3 "F:/GitHub/inf2591/tree_search/src/tree_search/Edge.x10"
            
            
            //#line 3 "F:/GitHub/inf2591/tree_search/src/tree_search/Edge.x10"
            this.__fieldInitializers_tree_search_Edge();
        }
        return this;
    }
    
    
    
    //#line 3 "F:/GitHub/inf2591/tree_search/src/tree_search/Edge.x10"
    final public void __fieldInitializers_tree_search_Edge() {
        
        //#line 3 "F:/GitHub/inf2591/tree_search/src/tree_search/Edge.x10"
        this.source = 0;
        
        //#line 3 "F:/GitHub/inf2591/tree_search/src/tree_search/Edge.x10"
        this.destination = 0;
        
        //#line 3 "F:/GitHub/inf2591/tree_search/src/tree_search/Edge.x10"
        this.weight = 0;
    }
}

