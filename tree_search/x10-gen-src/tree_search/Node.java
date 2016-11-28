package tree_search;


@x10.runtime.impl.java.X10Generated
public class Node extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Node> $RTT = 
        x10.rtt.NamedType.<Node> make("tree_search.Node",
                                      Node.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(tree_search.Node $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Node.class + " calling"); } 
        $_obj.adjacency_list = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        tree_search.Node $_obj = new tree_search.Node((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.adjacency_list);
        
    }
    
    // constructor just for allocation
    public Node(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 8 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Node.x10"
    public x10.util.List<tree_search.Edge> adjacency_list;
    
    
    //#line 9 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Node.x10"
    public void Node() {
        
    }
    
    
    //#line 7 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Node.x10"
    final public tree_search.Node tree_search$Node$$this$tree_search$Node() {
        
        //#line 7 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Node.x10"
        return tree_search.Node.this;
    }
    
    
    //#line 7 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Node.x10"
    // creation method for java code (1-phase java constructor)
    public Node() {
        this((java.lang.System[]) null);
        tree_search$Node$$init$S();
    }
    
    // constructor for non-virtual call
    final public tree_search.Node tree_search$Node$$init$S() {
         {
            
            //#line 7 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Node.x10"
            
            
            //#line 7 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Node.x10"
            this.__fieldInitializers_tree_search_Node();
        }
        return this;
    }
    
    
    
    //#line 7 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Node.x10"
    final public void __fieldInitializers_tree_search_Node() {
        
        //#line 7 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Node.x10"
        this.adjacency_list = null;
    }
}

