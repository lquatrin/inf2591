package tree_search;


@x10.runtime.impl.java.X10Generated
public class Tour extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Tour> $RTT = 
        x10.rtt.NamedType.<Tour> make("tree_search.Tour",
                                      Tour.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(tree_search.Tour $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Tour.class + " calling"); } 
        $_obj.curr_cost = $deserializer.readLong();
        $_obj.listofnodes = $deserializer.readObject();
        $_obj.listofvisited = $deserializer.readObject();
        $_obj.size = $deserializer.readInt();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        tree_search.Tour $_obj = new tree_search.Tour((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.curr_cost);
        $serializer.write(this.listofnodes);
        $serializer.write(this.listofvisited);
        $serializer.write(this.size);
        
    }
    
    // constructor just for allocation
    public Tour(final java.lang.System[] $dummy) {
        
    }
    
    // synthetic type for parameter mangling
    public static final class __0$1x10$lang$Int$2 {}
    

    
    //#line 8 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
    public x10.util.ArrayList<x10.core.Int> listofnodes;
    
    //#line 9 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
    public x10.array.Array_1<x10.core.Int> listofvisited;
    
    //#line 10 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
    public int size;
    
    //#line 11 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
    public long curr_cost;
    
    
    //#line 15 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
    // creation method for java code (1-phase java constructor)
    public Tour(final x10.util.ArrayList<x10.core.Int> nodes, final int valor, __0$1x10$lang$Int$2 $dummy) {
        this((java.lang.System[]) null);
        tree_search$Tour$$init$S(nodes, valor, (tree_search.Tour.__0$1x10$lang$Int$2) null);
    }
    
    // constructor for non-virtual call
    final public tree_search.Tour tree_search$Tour$$init$S(final x10.util.ArrayList<x10.core.Int> nodes, final int valor, __0$1x10$lang$Int$2 $dummy) {
         {
            
            //#line 15 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            
            
            //#line 7 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            this.__fieldInitializers_tree_search_Tour();
            
            //#line 16 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            this.listofnodes = ((x10.util.ArrayList)(nodes));
            
            //#line 17 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            this.size = valor;
            
            //#line 18 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            final int t$483384 = this.size;
            
            //#line 18 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            final long t$483385 = ((long)(((int)(t$483384))));
            
            //#line 18 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            final x10.array.Array_1 t$483386 = ((x10.array.Array_1)(new x10.array.Array_1<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).x10$array$Array_1$$init$S(t$483385)));
            
            //#line 18 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            this.listofvisited = ((x10.array.Array_1)(t$483386));
            
            //#line 19 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            final long i$483349min$483446 = 0L;
            
            //#line 19 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            final int t$483447 = this.size;
            
            //#line 19 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            final long t$483448 = ((long)(((int)(t$483447))));
            
            //#line 19 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            final long i$483349max$483449 = ((t$483448) - (((long)(1L))));
            
            //#line 19 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            long i$483443 = i$483349min$483446;
            
            //#line 19 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            for (;
                 true;
                 ) {
                
                //#line 19 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
                final long t$483444 = i$483443;
                
                //#line 19 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
                final boolean t$483445 = ((t$483444) <= (((long)(i$483349max$483449))));
                
                //#line 19 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
                if (!(t$483445)) {
                    
                    //#line 19 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
                    break;
                }
                
                //#line 19 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
                final long i$483440 = i$483443;
                
                //#line 20 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
                final x10.array.Array_1 t$483437 = ((x10.array.Array_1)(this.listofvisited));
                
                //#line 20 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
                final int t$483438 = ((int)(long)(((long)(1L))));
                
                //#line 20 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
                final int t$483439 = (-(t$483438));
                
                //#line 20 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
                ((x10.array.Array_1<x10.core.Int>)t$483437).$set__1x10$array$Array_1$$T$G((long)(i$483440), x10.core.Int.$box(t$483439));
                
                //#line 19 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
                final long t$483441 = i$483443;
                
                //#line 19 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
                final long t$483442 = ((t$483441) + (((long)(1L))));
                
                //#line 19 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
                i$483443 = t$483442;
            }
            
            //#line 22 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            final x10.array.Array_1 t$483398 = ((x10.array.Array_1)(this.listofvisited));
            
            //#line 22 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            final int t$483397 = ((int)(long)(((long)(0L))));
            
            //#line 22 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            final long t$483399 = ((long)(((int)(t$483397))));
            
            //#line 22 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            final int t$483400 = ((int)(long)(((long)(1L))));
            
            //#line 22 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            ((x10.array.Array_1<x10.core.Int>)t$483398).$set__1x10$array$Array_1$$T$G((long)(t$483399), x10.core.Int.$box(t$483400));
            
            //#line 23 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            final x10.array.Array_1 t$483404 = ((x10.array.Array_1)(this.listofvisited));
            
            //#line 23 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            final x10.util.ArrayList t$483401 = ((x10.util.ArrayList)(this.listofnodes));
            
            //#line 23 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            final int t$483402 = x10.core.Int.$unbox(((x10.util.ArrayList<x10.core.Int>)t$483401).$apply$G((long)(1L)));
            
            //#line 23 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            final int t$483403 = t$483402;
            
            //#line 23 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            final long t$483405 = ((long)(((int)(t$483403))));
            
            //#line 23 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            final int t$483406 = ((int)(long)(((long)(1L))));
            
            //#line 23 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            ((x10.array.Array_1<x10.core.Int>)t$483404).$set__1x10$array$Array_1$$T$G((long)(t$483405), x10.core.Int.$box(t$483406));
            
            //#line 24 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            final long t$483407 = 0L;
            
            //#line 24 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            this.curr_cost = t$483407;
        }
        return this;
    }
    
    
    
    //#line 27 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
    public void AddNode(final int ind) {
        
        //#line 28 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        final x10.util.ArrayList t$483408 = ((x10.util.ArrayList)(this.listofnodes));
        
        //#line 28 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        ((x10.util.ArrayList<x10.core.Int>)t$483408).add__0x10$util$ArrayList$$T$O(x10.core.Int.$box(ind));
    }
    
    
    //#line 32 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
    public long GetSize$O() {
        
        //#line 33 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        final x10.util.ArrayList t$483409 = ((x10.util.ArrayList)(this.listofnodes));
        
        //#line 33 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        final long t$483410 = ((x10.util.ArrayList<x10.core.Int>)t$483409).size$O();
        
        //#line 33 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        return t$483410;
    }
    
    
    //#line 36 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
    public void RemoveNode() {
        
        //#line 37 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        final x10.util.ArrayList t$483411 = ((x10.util.ArrayList)(this.listofnodes));
        
        //#line 37 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        ((x10.util.ArrayList<x10.core.Int>)t$483411).removeLast$G();
    }
    
    
    //#line 40 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
    public x10.util.ArrayList GetList() {
        
        //#line 41 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        final x10.util.ArrayList t$483412 = ((x10.util.ArrayList)(this.listofnodes));
        
        //#line 41 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        return t$483412;
    }
    
    
    //#line 44 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
    public void SetNodeVisited(final int i) {
        
        //#line 45 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        final x10.array.Array_1 t$483413 = ((x10.array.Array_1)(this.listofvisited));
        
        //#line 45 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        final long t$483414 = ((long)(((int)(i))));
        
        //#line 45 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        final int t$483415 = ((int)(long)(((long)(1L))));
        
        //#line 45 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        ((x10.array.Array_1<x10.core.Int>)t$483413).$set__1x10$array$Array_1$$T$G((long)(t$483414), x10.core.Int.$box(t$483415));
    }
    
    
    //#line 48 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
    public int GetNodeVisited$O(final int i) {
        
        //#line 49 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        final x10.array.Array_1 t$483416 = ((x10.array.Array_1)(this.listofvisited));
        
        //#line 49 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        final long t$483417 = ((long)(((int)(i))));
        
        //#line 49 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        final int t$483418 = x10.core.Int.$unbox(((x10.array.Array_1<x10.core.Int>)t$483416).$apply$G((long)(t$483417)));
        
        //#line 49 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        final int t$483419 = t$483418;
        
        //#line 49 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        return t$483419;
    }
    
    
    //#line 52 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
    public void SetCurrCost(final long v) {
        
        //#line 54 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        final long t$483420 = this.curr_cost;
        
        //#line 54 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        final long t$483421 = ((t$483420) + (((long)(v))));
        
        //#line 54 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        this.curr_cost = t$483421;
    }
    
    
    //#line 57 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
    public long GetCurrCost$O() {
        
        //#line 59 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        final long t$483422 = this.curr_cost;
        
        //#line 59 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        return t$483422;
    }
    
    
    //#line 62 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
    public void PrintTour() {
        
        //#line 63 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        java.lang.String str = "";
        
        //#line 64 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        final long i$483367min$483461 = 0L;
        
        //#line 64 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        final x10.util.ArrayList t$483462 = ((x10.util.ArrayList)(this.listofnodes));
        
        //#line 64 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        final long t$483463 = ((x10.util.ArrayList<x10.core.Int>)t$483462).size$O();
        
        //#line 64 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        final long i$483367max$483464 = ((t$483463) - (((long)(1L))));
        
        //#line 64 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        long i$483458 = i$483367min$483461;
        
        //#line 64 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        for (;
             true;
             ) {
            
            //#line 64 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            final long t$483459 = i$483458;
            
            //#line 64 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            final boolean t$483460 = ((t$483459) <= (((long)(i$483367max$483464))));
            
            //#line 64 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            if (!(t$483460)) {
                
                //#line 64 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
                break;
            }
            
            //#line 64 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            final long i$483455 = i$483458;
            
            //#line 65 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            final java.lang.String t$483450 = ((java.lang.String)(str));
            
            //#line 65 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            final x10.util.ArrayList t$483451 = ((x10.util.ArrayList)(this.listofnodes));
            
            //#line 65 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            final int t$483452 = x10.core.Int.$unbox(((x10.util.ArrayList<x10.core.Int>)t$483451).$apply$G((long)(i$483455)));
            
            //#line 65 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            final java.lang.String t$483453 = (((x10.core.Int.$box(t$483452))) + ("\t"));
            
            //#line 65 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            final java.lang.String t$483454 = ((t$483450) + (t$483453));
            
            //#line 65 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            str = ((java.lang.String)(t$483454));
            
            //#line 64 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            final long t$483456 = i$483458;
            
            //#line 64 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            final long t$483457 = ((t$483456) + (((long)(1L))));
            
            //#line 64 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
            i$483458 = t$483457;
        }
        
        //#line 67 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        final x10.io.Printer t$483435 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 67 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        final java.lang.String t$483436 = ((java.lang.String)(str));
        
        //#line 67 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        t$483435.println(((java.lang.Object)(t$483436)));
    }
    
    
    //#line 70 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
    public static class $Main extends x10.runtime.impl.java.Runtime
    {
        // java main method
        public static void main(java.lang.String[] args) {
            // start native runtime
            new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.core.Rail<java.lang.String> args) {
            // call the original app-main method
            Tour.main(args);
        }
    }
    
    // the original app-main method
    public static void main(final x10.core.Rail<java.lang.String> id$480645) {
        
    }
    
    
    //#line 7 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
    final public tree_search.Tour tree_search$Tour$$this$tree_search$Tour() {
        
        //#line 7 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        return tree_search.Tour.this;
    }
    
    
    //#line 7 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
    final public void __fieldInitializers_tree_search_Tour() {
        
        //#line 7 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        this.listofvisited = null;
        
        //#line 7 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        this.size = 0;
        
        //#line 7 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/Tour.x10"
        this.curr_cost = 0L;
    }
}

