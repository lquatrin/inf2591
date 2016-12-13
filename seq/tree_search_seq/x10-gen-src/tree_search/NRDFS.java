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
        $_obj.BestTour = $deserializer.readObject();
        $_obj.Bestcost = $deserializer.readInt();
        $_obj.distMatrix = $deserializer.readObject();
        $_obj.pilha = $deserializer.readObject();
        $_obj.size = $deserializer.readInt();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        tree_search.NRDFS $_obj = new tree_search.NRDFS((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.BestTour);
        $serializer.write(this.Bestcost);
        $serializer.write(this.distMatrix);
        $serializer.write(this.pilha);
        $serializer.write(this.size);
        
    }
    
    // constructor just for allocation
    public NRDFS(final java.lang.System[] $dummy) {
        
    }
    
    // synthetic type for parameter mangling
    public static final class __1$1x10$lang$Int$2 {}
    

    
    //#line 11 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
    public int size;
    
    //#line 13 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
    public x10.util.Stack<tree_search.Tour> pilha;
    
    //#line 15 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
    public x10.array.Array_2<x10.core.Int> distMatrix;
    
    //#line 16 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
    public int Bestcost;
    
    //#line 17 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
    public tree_search.Tour BestTour;
    
    
    //#line 19 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
    // creation method for java code (1-phase java constructor)
    public NRDFS(final int size, final x10.array.Array_2<x10.core.Int> matrix, __1$1x10$lang$Int$2 $dummy) {
        this((java.lang.System[]) null);
        tree_search$NRDFS$$init$S(size, matrix, (tree_search.NRDFS.__1$1x10$lang$Int$2) null);
    }
    
    // constructor for non-virtual call
    final public tree_search.NRDFS tree_search$NRDFS$$init$S(final int size, final x10.array.Array_2<x10.core.Int> matrix, __1$1x10$lang$Int$2 $dummy) {
         {
            
            //#line 19 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            
            
            //#line 9 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            this.__fieldInitializers_tree_search_NRDFS();
            
            //#line 20 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            this.size = size;
            
            //#line 21 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            this.distMatrix = ((x10.array.Array_2)(matrix));
            
            //#line 22 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            final int t$600155 = java.lang.Integer.MAX_VALUE;
            
            //#line 22 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            this.Bestcost = t$600155;
        }
        return this;
    }
    
    
    
    //#line 25 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
    private boolean BestTour$O(final tree_search.Tour t_tour) {
        
        //#line 26 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        int value = ((int)(long)(((long)(0L))));
        
        //#line 27 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        x10.util.ArrayList List = t_tour.GetList();
        
        //#line 29 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final long i$600120min$600283 = 0L;
        
        //#line 29 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final int t$600284 = this.size;
        
        //#line 29 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final long t$600285 = ((long)(((int)(t$600284))));
        
        //#line 29 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final long i$600120max$600286 = ((t$600285) - (((long)(2L))));
        
        //#line 29 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        long i$600280 = i$600120min$600283;
        
        //#line 29 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        for (;
             true;
             ) {
            
            //#line 29 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            final long t$600281 = i$600280;
            
            //#line 29 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            final boolean t$600282 = ((t$600281) <= (((long)(i$600120max$600286))));
            
            //#line 29 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            if (!(t$600282)) {
                
                //#line 29 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                break;
            }
            
            //#line 29 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            final long i$600277 = i$600280;
            
            //#line 30 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            final x10.util.ArrayList t$600264 = ((x10.util.ArrayList)(List));
            
            //#line 30 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            int x$600265 = x10.core.Int.$unbox(((x10.util.ArrayList<x10.core.Int>)t$600264).get$G((long)(i$600277)));
            
            //#line 31 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            final x10.util.ArrayList t$600266 = ((x10.util.ArrayList)(List));
            
            //#line 31 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            final long t$600267 = ((i$600277) + (((long)(1L))));
            
            //#line 31 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            int y$600268 = x10.core.Int.$unbox(((x10.util.ArrayList<x10.core.Int>)t$600266).get$G((long)(t$600267)));
            
            //#line 32 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            final int t$600269 = value;
            
            //#line 32 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            final x10.array.Array_2 t$600270 = ((x10.array.Array_2)(this.distMatrix));
            
            //#line 32 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            final int t$600271 = x$600265;
            
            //#line 32 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            final long t$600272 = ((long)(((int)(t$600271))));
            
            //#line 32 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            final int t$600273 = y$600268;
            
            //#line 32 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            final long t$600274 = ((long)(((int)(t$600273))));
            
            //#line 32 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            final int t$600275 = x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t$600270).$apply$G((long)(t$600272), (long)(t$600274)));
            
            //#line 32 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            final int t$600276 = ((t$600269) + (((int)(t$600275))));
            
            //#line 32 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            value = t$600276;
            
            //#line 29 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            final long t$600278 = i$600280;
            
            //#line 29 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            final long t$600279 = ((t$600278) + (((long)(1L))));
            
            //#line 29 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            i$600280 = t$600279;
        }
        
        //#line 35 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final int t$600181 = value;
        
        //#line 35 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final x10.array.Array_2 t$600179 = ((x10.array.Array_2)(this.distMatrix));
        
        //#line 35 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final x10.util.ArrayList t$600176 = ((x10.util.ArrayList)(List));
        
        //#line 35 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final int t$600174 = this.size;
        
        //#line 35 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final long t$600175 = ((long)(((int)(t$600174))));
        
        //#line 35 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final long t$600177 = ((t$600175) - (((long)(1L))));
        
        //#line 35 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final int t$600178 = x10.core.Int.$unbox(((x10.util.ArrayList<x10.core.Int>)t$600176).get$G((long)(t$600177)));
        
        //#line 35 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final long t$600180 = ((long)(((int)(t$600178))));
        
        //#line 35 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final int t$600182 = x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t$600179).$apply$G((long)(t$600180), (long)(0L)));
        
        //#line 35 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final int t$600183 = ((t$600181) + (((int)(t$600182))));
        
        //#line 35 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        value = t$600183;
        
        //#line 37 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final int t$600184 = value;
        
        //#line 37 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final int t$600185 = this.Bestcost;
        
        //#line 37 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final boolean t$600188 = ((t$600184) < (((int)(t$600185))));
        
        //#line 37 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        if (t$600188) {
            
            //#line 38 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            final int t$600186 = value;
            
            //#line 38 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            this.Bestcost = t$600186;
            
            //#line 39 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            final int t$600187 = ((int)(long)(((long)(0L))));
            
            //#line 39 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            t_tour.AddNode((int)(t$600187));
            
            //#line 41 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            return true;
        } else {
            
            //#line 44 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            return false;
        }
    }
    
    public static boolean BestTour$P$O(final tree_search.Tour t_tour, final tree_search.NRDFS NRDFS) {
        return NRDFS.BestTour$O(((tree_search.Tour)(t_tour)));
    }
    
    
    //#line 49 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
    private int CityCount$O(final tree_search.Tour t_tour) {
        
        //#line 50 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final long t$600189 = t_tour.GetSize$O();
        
        //#line 50 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final int t$600190 = ((int)(long)(((long)(t$600189))));
        
        //#line 50 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        return t$600190;
    }
    
    public static int CityCount$P$O(final tree_search.Tour t_tour, final tree_search.NRDFS NRDFS) {
        return NRDFS.CityCount$O(((tree_search.Tour)(t_tour)));
    }
    
    
    //#line 53 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
    private void Removelastcity(final tree_search.Tour t_tour) {
        
        //#line 55 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        t_tour.RemoveNode();
    }
    
    public static void Removelastcity$P(final tree_search.Tour t_tour, final tree_search.NRDFS NRDFS) {
        NRDFS.Removelastcity(((tree_search.Tour)(t_tour)));
    }
    
    
    //#line 58 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
    private boolean Feasible$O(final tree_search.Tour t_tour, final int i) {
        
        //#line 60 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        boolean resp = false;
        
        //#line 61 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        x10.util.ArrayList ind = t_tour.GetList();
        
        //#line 62 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        boolean contains = false;
        
        //#line 63 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final long i$600138min$600297 = 0L;
        
        //#line 63 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final x10.util.ArrayList t$600298 = ((x10.util.ArrayList)(ind));
        
        //#line 63 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final long t$600299 = ((x10.util.ArrayList<x10.core.Int>)t$600298).size$O();
        
        //#line 63 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final long i$600138max$600300 = ((t$600299) - (((long)(1L))));
        
        //#line 63 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        long i$600294 = i$600138min$600297;
        
        //#line 63 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        for (;
             true;
             ) {
            
            //#line 63 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            final long t$600295 = i$600294;
            
            //#line 63 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            final boolean t$600296 = ((t$600295) <= (((long)(i$600138max$600300))));
            
            //#line 63 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            if (!(t$600296)) {
                
                //#line 63 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                break;
            }
            
            //#line 63 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            final long j$600291 = i$600294;
            
            //#line 64 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            final x10.util.ArrayList t$600287 = ((x10.util.ArrayList)(ind));
            
            //#line 64 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            final int t$600288 = x10.core.Int.$unbox(((x10.util.ArrayList<x10.core.Int>)t$600287).$apply$G((long)(j$600291)));
            
            //#line 64 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            final int t$600289 = t$600288;
            
            //#line 64 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            final boolean t$600290 = ((int) i) == ((int) t$600289);
            
            //#line 64 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            if (t$600290) {
                
                //#line 65 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                return false;
            }
            
            //#line 63 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            final long t$600292 = i$600294;
            
            //#line 63 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            final long t$600293 = ((t$600292) + (((long)(1L))));
            
            //#line 63 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            i$600294 = t$600293;
        }
        
        //#line 69 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        t_tour.SetNodeVisited((int)(i));
        
        //#line 70 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        return true;
    }
    
    public static boolean Feasible$P$O(final tree_search.Tour t_tour, final int i, final tree_search.NRDFS NRDFS) {
        return NRDFS.Feasible$O(((tree_search.Tour)(t_tour)), (int)(i));
    }
    
    
    //#line 74 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
    private void AddCity(final tree_search.Tour t_tour, final int i) {
        
        //#line 75 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        int value = ((int)(long)(((long)(0L))));
        
        //#line 76 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        t_tour.AddNode((int)(i));
        
        //#line 77 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        t_tour.SetNodeVisited((int)(i));
        
        //#line 78 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        x10.util.ArrayList List = t_tour.GetList();
        
        //#line 79 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final x10.util.ArrayList t$600204 = ((x10.util.ArrayList)(List));
        
        //#line 79 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final x10.util.ArrayList t$600202 = ((x10.util.ArrayList)(List));
        
        //#line 79 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final long t$600203 = ((x10.util.ArrayList<x10.core.Int>)t$600202).size$O();
        
        //#line 79 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final long t$600205 = ((t$600203) - (((long)(2L))));
        
        //#line 79 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        int x = x10.core.Int.$unbox(((x10.util.ArrayList<x10.core.Int>)t$600204).get$G((long)(t$600205)));
        
        //#line 80 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final x10.util.ArrayList t$600208 = ((x10.util.ArrayList)(List));
        
        //#line 80 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final x10.util.ArrayList t$600206 = ((x10.util.ArrayList)(List));
        
        //#line 80 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final long t$600207 = ((x10.util.ArrayList<x10.core.Int>)t$600206).size$O();
        
        //#line 80 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final long t$600209 = ((t$600207) - (((long)(1L))));
        
        //#line 80 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        int y = x10.core.Int.$unbox(((x10.util.ArrayList<x10.core.Int>)t$600208).get$G((long)(t$600209)));
        
        //#line 81 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final x10.array.Array_2 t$600212 = ((x10.array.Array_2)(this.distMatrix));
        
        //#line 81 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final int t$600210 = x;
        
        //#line 81 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final long t$600213 = ((long)(((int)(t$600210))));
        
        //#line 81 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final int t$600211 = y;
        
        //#line 81 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final long t$600214 = ((long)(((int)(t$600211))));
        
        //#line 81 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final int t$600215 = x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t$600212).$apply$G((long)(t$600213), (long)(t$600214)));
        
        //#line 81 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        value = t$600215;
        
        //#line 82 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final int t$600216 = value;
        
        //#line 82 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final long t$600217 = ((long)(((int)(t$600216))));
        
        //#line 82 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        t_tour.SetCurrCost((long)(t$600217));
    }
    
    public static void AddCity$P(final tree_search.Tour t_tour, final int i, final tree_search.NRDFS NRDFS) {
        NRDFS.AddCity(((tree_search.Tour)(t_tour)), (int)(i));
    }
    
    
    //#line 85 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
    private void UpdateBestTour(final tree_search.Tour t_tour) {
        
        //#line 87 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        this.BestTour = ((tree_search.Tour)(t_tour));
    }
    
    public static void UpdateBestTour$P(final tree_search.Tour t_tour, final tree_search.NRDFS NRDFS) {
        NRDFS.UpdateBestTour(((tree_search.Tour)(t_tour)));
    }
    
    
    //#line 90 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
    public void addTour(final tree_search.Tour t_tour) {
        
        //#line 91 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final x10.util.Stack t$600218 = ((x10.util.Stack)(this.pilha));
        
        //#line 91 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        ((x10.util.Stack<tree_search.Tour>)t$600218).push__0x10$util$Stack$$T$O(((tree_search.Tour)(t_tour)));
    }
    
    
    //#line 95 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
    public boolean CheckBestTourPartialCost$O(final long tour_cost) {
        
        //#line 96 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final int t$600219 = this.Bestcost;
        
        //#line 96 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final long t$600220 = ((long)(((int)(t$600219))));
        
        //#line 96 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final boolean t$600221 = ((tour_cost) < (((long)(t$600220))));
        
        //#line 96 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        if (t$600221) {
            
            //#line 98 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            return true;
        }
        
        //#line 100 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        return false;
    }
    
    
    //#line 103 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
    public void Solve() {
        
        //#line 104 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        while (true) {
            
            //#line 104 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            final x10.util.Stack t$600222 = ((x10.util.Stack)(this.pilha));
            
            //#line 104 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            final boolean t$600223 = ((x10.util.ArrayList<tree_search.Tour>)t$600222).isEmpty$O();
            
            //#line 104 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            final boolean t$600260 = !(t$600223);
            
            //#line 104 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            if (!(t$600260)) {
                
                //#line 104 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                break;
            }
            
            //#line 107 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            final x10.util.Stack t$600320 = ((x10.util.Stack)(this.pilha));
            
            //#line 107 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            tree_search.Tour curr_tour$600321 = ((x10.util.Stack<tree_search.Tour>)t$600320).pop$G();
            
            //#line 109 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            final tree_search.Tour t$600322 = ((tree_search.Tour)(curr_tour$600321));
            
            //#line 109 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            final long t$600323 = t$600322.GetCurrCost$O();
            
            //#line 109 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            final boolean t$600324 = this.CheckBestTourPartialCost$O((long)(t$600323));
            
            //#line 109 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
            if (t$600324) {
                
                //#line 110 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                final tree_search.Tour t$600325 = ((tree_search.Tour)(curr_tour$600321));
                
                //#line 110 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                final int t$600326 = this.CityCount$O(((tree_search.Tour)(t$600325)));
                
                //#line 110 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                final int t$600327 = this.size;
                
                //#line 110 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                final int t$600328 = t$600327;
                
                //#line 110 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                final boolean t$600329 = ((int) t$600326) == ((int) t$600328);
                
                //#line 110 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                if (t$600329) {
                    
                    //#line 111 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                    final tree_search.Tour t$600330 = ((tree_search.Tour)(curr_tour$600321));
                    
                    //#line 111 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                    final boolean t$600331 = this.BestTour$O(((tree_search.Tour)(t$600330)));
                    
                    //#line 111 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                    if (t$600331) {
                        
                        //#line 112 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                        final tree_search.Tour t$600332 = ((tree_search.Tour)(curr_tour$600321));
                        
                        //#line 112 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                        this.UpdateBestTour(((tree_search.Tour)(t$600332)));
                    }
                } else {
                    
                    //#line 116 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                    final int t$600333 = this.size;
                    
                    //#line 116 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                    final long t$600334 = ((long)(((int)(t$600333))));
                    
                    //#line 116 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                    final long t$600335 = ((t$600334) - (((long)(1L))));
                    
                    //#line 116 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                    int i$600336 = ((int)(long)(((long)(t$600335))));
                    
                    //#line 116 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 116 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                        final int t$600337 = i$600336;
                        
                        //#line 116 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                        final int t$600338 = ((int)(long)(((long)(0L))));
                        
                        //#line 116 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                        final boolean t$600339 = ((t$600337) >= (((int)(t$600338))));
                        
                        //#line 116 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                        if (!(t$600339)) {
                            
                            //#line 116 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                            break;
                        }
                        
                        //#line 117 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                        final tree_search.Tour t$600301 = ((tree_search.Tour)(curr_tour$600321));
                        
                        //#line 117 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                        final int t$600302 = i$600336;
                        
                        //#line 117 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                        final int t$600303 = t$600302;
                        
                        //#line 117 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                        final boolean t$600304 = this.Feasible$O(((tree_search.Tour)(t$600301)), (int)(t$600303));
                        
                        //#line 117 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                        if (t$600304) {
                            
                            //#line 118 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                            final tree_search.Tour t$600305 = ((tree_search.Tour)(curr_tour$600321));
                            
                            //#line 118 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                            final int t$600306 = i$600336;
                            
                            //#line 118 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                            final int t$600307 = t$600306;
                            
                            //#line 118 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                            this.AddCity(((tree_search.Tour)(t$600305)), (int)(t$600307));
                            
                            //#line 119 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                            final tree_search.Tour t$600308 = ((tree_search.Tour)(curr_tour$600321));
                            
                            //#line 119 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                            final x10.util.ArrayList t$600309 = t$600308.GetList();
                            
                            //#line 119 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                            x10.util.ArrayList m_array$600310 = ((x10.util.ArrayList<x10.core.Int>)
                                                                  ((x10.util.ArrayList<x10.core.Int>)t$600309).clone());
                            
                            //#line 120 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                            final x10.util.ArrayList t$600311 = ((x10.util.ArrayList)(m_array$600310));
                            
                            //#line 120 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                            final int t$600312 = this.size;
                            
                            //#line 120 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                            tree_search.Tour newtour$600313 = new tree_search.Tour((java.lang.System[]) null).tree_search$Tour$$init$S(t$600311, ((int)(t$600312)), (tree_search.Tour.__0$1x10$lang$Int$2) null);
                            
                            //#line 121 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                            final x10.util.Stack t$600314 = ((x10.util.Stack)(this.pilha));
                            
                            //#line 121 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                            final tree_search.Tour t$600315 = ((tree_search.Tour)(newtour$600313));
                            
                            //#line 121 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                            ((x10.util.Stack<tree_search.Tour>)t$600314).push__0x10$util$Stack$$T$O(((tree_search.Tour)(t$600315)));
                            
                            //#line 122 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                            final tree_search.Tour t$600316 = ((tree_search.Tour)(curr_tour$600321));
                            
                            //#line 122 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                            this.Removelastcity(((tree_search.Tour)(t$600316)));
                        }
                        
                        //#line 116 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                        final int t$600317 = i$600336;
                        
                        //#line 116 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                        final int t$600318 = ((int)(long)(((long)(1L))));
                        
                        //#line 116 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                        final int t$600319 = ((t$600317) - (((int)(t$600318))));
                        
                        //#line 116 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
                        i$600336 = t$600319;
                    }
                }
            }
        }
        
        //#line 128 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final x10.io.Printer t$600261 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 128 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        t$600261.println(((java.lang.Object)("print best tour")));
        
        //#line 129 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final tree_search.Tour t$600262 = ((tree_search.Tour)(this.BestTour));
        
        //#line 129 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        t$600262.PrintTour();
    }
    
    
    //#line 132 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
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
            NRDFS.main(args);
        }
    }
    
    // the original app-main method
    public static void main(final x10.core.Rail<java.lang.String> id$595965) {
        
    }
    
    
    //#line 9 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
    final public tree_search.NRDFS tree_search$NRDFS$$this$tree_search$NRDFS() {
        
        //#line 9 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        return tree_search.NRDFS.this;
    }
    
    
    //#line 9 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
    final public void __fieldInitializers_tree_search_NRDFS() {
        
        //#line 13 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        final x10.util.Stack t$600263 = ((x10.util.Stack)(new x10.util.Stack<tree_search.Tour>((java.lang.System[]) null, tree_search.Tour.$RTT).x10$util$Stack$$init$S()));
        
        //#line 9 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        this.pilha = t$600263;
        
        //#line 9 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        this.Bestcost = 0;
        
        //#line 9 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/tree_search/NRDFS.x10"
        this.BestTour = null;
    }
}

