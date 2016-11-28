package tree_search;

@x10.runtime.impl.java.X10Generated
public class RDFS extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<RDFS> $RTT = 
        x10.rtt.NamedType.<RDFS> make("tree_search.RDFS",
                                      RDFS.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(tree_search.RDFS $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + RDFS.class + " calling"); } 
        $_obj.x = $deserializer.readDouble();
        $_obj.y = $deserializer.readDouble();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        tree_search.RDFS $_obj = new tree_search.RDFS((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.x);
        $serializer.write(this.y);
        
    }
    
    // constructor just for allocation
    public RDFS(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 23 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/RDFS.x10"
    public double x;
    
    //#line 24 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/RDFS.x10"
    public double y;
    
    
    //#line 25 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/RDFS.x10"
    // creation method for java code (1-phase java constructor)
    public RDFS(final double x, final double y) {
        this((java.lang.System[]) null);
        tree_search$RDFS$$init$S(x, y);
    }
    
    // constructor for non-virtual call
    final public tree_search.RDFS tree_search$RDFS$$init$S(final double x, final double y) {
         {
            
            //#line 25 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/RDFS.x10"
            
            
            //#line 22 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/RDFS.x10"
            this.__fieldInitializers_tree_search_RDFS();
            
            //#line 26 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/RDFS.x10"
            this.x = x;
            
            //#line 26 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/RDFS.x10"
            this.y = y;
        }
        return this;
    }
    
    
    
    //#line 29 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/RDFS.x10"
    public double magnitude$O() {
        
        //#line 29 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/RDFS.x10"
        final double t$425 = this.x;
        
        //#line 29 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/RDFS.x10"
        final double t$426 = this.x;
        
        //#line 29 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/RDFS.x10"
        final double t$429 = ((t$425) * (((double)(t$426))));
        
        //#line 29 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/RDFS.x10"
        final double t$427 = this.y;
        
        //#line 29 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/RDFS.x10"
        final double t$428 = this.y;
        
        //#line 29 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/RDFS.x10"
        final double t$430 = ((t$427) * (((double)(t$428))));
        
        //#line 29 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/RDFS.x10"
        final double t$431 = ((t$429) + (((double)(t$430))));
        
        //#line 29 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/RDFS.x10"
        return t$431;
    }
    
    
    //#line 22 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/RDFS.x10"
    final public tree_search.RDFS tree_search$RDFS$$this$tree_search$RDFS() {
        
        //#line 22 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/RDFS.x10"
        return tree_search.RDFS.this;
    }
    
    
    //#line 22 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/RDFS.x10"
    final public void __fieldInitializers_tree_search_RDFS() {
        
    }
}

