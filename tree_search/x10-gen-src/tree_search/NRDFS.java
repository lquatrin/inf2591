package tree_search;

@x10.runtime.impl.java.X10Generated
public class NRDFS extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<NRDFS> $RTT = 
        x10.rtt.NamedType.<NRDFS> make("tree_search.NRDFS",
                                       NRDFS.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(tree_search.NRDFS $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + NRDFS.class + " calling"); } 
        $_obj.x = $deserializer.readDouble();
        $_obj.y = $deserializer.readDouble();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        tree_search.NRDFS $_obj = new tree_search.NRDFS((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.x);
        $serializer.write(this.y);
        
    }
    
    // constructor just for allocation
    public NRDFS(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 46 "F:/GitHub/inf2591/tree_search/src/tree_search/NRDFS.x10"
    public double x;
    
    //#line 47 "F:/GitHub/inf2591/tree_search/src/tree_search/NRDFS.x10"
    public double y;
    
    
    //#line 48 "F:/GitHub/inf2591/tree_search/src/tree_search/NRDFS.x10"
    // creation method for java code (1-phase java constructor)
    public NRDFS(final double x, final double y) {
        this((java.lang.System[]) null);
        tree_search$NRDFS$$init$S(x, y);
    }
    
    // constructor for non-virtual call
    final public tree_search.NRDFS tree_search$NRDFS$$init$S(final double x, final double y) {
         {
            
            //#line 48 "F:/GitHub/inf2591/tree_search/src/tree_search/NRDFS.x10"
            
            
            //#line 45 "F:/GitHub/inf2591/tree_search/src/tree_search/NRDFS.x10"
            this.__fieldInitializers_tree_search_NRDFS();
            
            //#line 49 "F:/GitHub/inf2591/tree_search/src/tree_search/NRDFS.x10"
            this.x = x;
            
            //#line 49 "F:/GitHub/inf2591/tree_search/src/tree_search/NRDFS.x10"
            this.y = y;
        }
        return this;
    }
    
    
    
    //#line 52 "F:/GitHub/inf2591/tree_search/src/tree_search/NRDFS.x10"
    public double magnitude$O() {
        
        //#line 52 "F:/GitHub/inf2591/tree_search/src/tree_search/NRDFS.x10"
        final double t$746 = this.x;
        
        //#line 52 "F:/GitHub/inf2591/tree_search/src/tree_search/NRDFS.x10"
        final double t$747 = this.x;
        
        //#line 52 "F:/GitHub/inf2591/tree_search/src/tree_search/NRDFS.x10"
        final double t$750 = ((t$746) * (((double)(t$747))));
        
        //#line 52 "F:/GitHub/inf2591/tree_search/src/tree_search/NRDFS.x10"
        final double t$748 = this.y;
        
        //#line 52 "F:/GitHub/inf2591/tree_search/src/tree_search/NRDFS.x10"
        final double t$749 = this.y;
        
        //#line 52 "F:/GitHub/inf2591/tree_search/src/tree_search/NRDFS.x10"
        final double t$751 = ((t$748) * (((double)(t$749))));
        
        //#line 52 "F:/GitHub/inf2591/tree_search/src/tree_search/NRDFS.x10"
        final double t$752 = ((t$750) + (((double)(t$751))));
        
        //#line 52 "F:/GitHub/inf2591/tree_search/src/tree_search/NRDFS.x10"
        return t$752;
    }
    
    
    //#line 45 "F:/GitHub/inf2591/tree_search/src/tree_search/NRDFS.x10"
    final public tree_search.NRDFS tree_search$NRDFS$$this$tree_search$NRDFS() {
        
        //#line 45 "F:/GitHub/inf2591/tree_search/src/tree_search/NRDFS.x10"
        return tree_search.NRDFS.this;
    }
    
    
    //#line 45 "F:/GitHub/inf2591/tree_search/src/tree_search/NRDFS.x10"
    final public void __fieldInitializers_tree_search_NRDFS() {
        
    }
}

