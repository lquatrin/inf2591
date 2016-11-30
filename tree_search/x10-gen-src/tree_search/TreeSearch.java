package tree_search;


@x10.runtime.impl.java.X10Generated
public class TreeSearch extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<TreeSearch> $RTT = 
        x10.rtt.NamedType.<TreeSearch> make("tree_search.TreeSearch",
                                            TreeSearch.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(tree_search.TreeSearch $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + TreeSearch.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        tree_search.TreeSearch $_obj = new tree_search.TreeSearch((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public TreeSearch(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 10 "F:/GitHub/inf2591/tree_search/src/tree_search/TreeSearch.x10"
    public void TreeSearch() {
        
        //#line 11 "F:/GitHub/inf2591/tree_search/src/tree_search/TreeSearch.x10"
        final x10.io.Printer t$100520 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 11 "F:/GitHub/inf2591/tree_search/src/tree_search/TreeSearch.x10"
        t$100520.println(((java.lang.Object)("Tree Search")));
    }
    
    
    //#line 9 "F:/GitHub/inf2591/tree_search/src/tree_search/TreeSearch.x10"
    final public tree_search.TreeSearch tree_search$TreeSearch$$this$tree_search$TreeSearch() {
        
        //#line 9 "F:/GitHub/inf2591/tree_search/src/tree_search/TreeSearch.x10"
        return tree_search.TreeSearch.this;
    }
    
    
    //#line 9 "F:/GitHub/inf2591/tree_search/src/tree_search/TreeSearch.x10"
    // creation method for java code (1-phase java constructor)
    public TreeSearch() {
        this((java.lang.System[]) null);
        tree_search$TreeSearch$$init$S();
    }
    
    // constructor for non-virtual call
    final public tree_search.TreeSearch tree_search$TreeSearch$$init$S() {
         {
            
            //#line 9 "F:/GitHub/inf2591/tree_search/src/tree_search/TreeSearch.x10"
            
            
            //#line 9 "F:/GitHub/inf2591/tree_search/src/tree_search/TreeSearch.x10"
            this.__fieldInitializers_tree_search_TreeSearch();
        }
        return this;
    }
    
    
    
    //#line 9 "F:/GitHub/inf2591/tree_search/src/tree_search/TreeSearch.x10"
    final public void __fieldInitializers_tree_search_TreeSearch() {
        
    }
}

