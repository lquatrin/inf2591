
@x10.runtime.impl.java.X10Generated
public class Hello extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Hello> $RTT = 
        x10.rtt.NamedType.<Hello> make("Hello",
                                       Hello.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(Hello $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Hello.class + " calling"); } 
        $_obj.dist = $deserializer.readObject();
        $_obj.size = $deserializer.readInt();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        Hello $_obj = new Hello((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.dist);
        $serializer.write(this.size);
        
    }
    
    // constructor just for allocation
    public Hello(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 22 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
    public int size;
    
    //#line 23 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
    public x10.array.Array_2<x10.core.Int> dist;
    
    
    //#line 25 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
    // creation method for java code (1-phase java constructor)
    public Hello(final x10.io.Reader r) throws java.lang.RuntimeException {
        this((java.lang.System[]) null);
        Hello$$init$S(r);
    }
    
    // constructor for non-virtual call
    final public Hello Hello$$init$S(final x10.io.Reader r) throws java.lang.RuntimeException {
         {
            
            //#line 25 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            
            
            //#line 20 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            this.__fieldInitializers_Hello();
            
            //#line 26 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final int t$608595 = Hello.nextInt$O(((x10.io.Reader)(r)));
            
            //#line 26 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            this.size = t$608595;
            
            //#line 27 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final int t$608596 = this.size;
            
            //#line 27 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final long t$608598 = ((long)(((int)(t$608596))));
            
            //#line 27 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final int t$608597 = this.size;
            
            //#line 27 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final long t$608599 = ((long)(((int)(t$608597))));
            
            //#line 27 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final x10.array.Array_2 t$608600 = ((x10.array.Array_2)(new x10.array.Array_2<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).x10$array$Array_2$$init$S(t$608598, t$608599)));
            
            //#line 27 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            this.dist = ((x10.array.Array_2)(t$608600));
            
            //#line 28 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final long i$608524min$608690 = 0L;
            
            //#line 28 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final int t$608691 = this.size;
            
            //#line 28 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final long t$608692 = ((long)(((int)(t$608691))));
            
            //#line 28 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final long i$608524max$608693 = ((t$608692) - (((long)(1L))));
            
            //#line 28 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            long i$608687 = i$608524min$608690;
            
            //#line 28 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            for (;
                 true;
                 ) {
                
                //#line 28 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                final long t$608688 = i$608687;
                
                //#line 28 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                final boolean t$608689 = ((t$608688) <= (((long)(i$608524max$608693))));
                
                //#line 28 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                if (!(t$608689)) {
                    
                    //#line 28 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                    break;
                }
                
                //#line 28 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                final long i$608684 = i$608687;
                
                //#line 29 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                final long i$608506min$608680 = 0L;
                
                //#line 29 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                final int t$608681 = this.size;
                
                //#line 29 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                final long t$608682 = ((long)(((int)(t$608681))));
                
                //#line 29 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                final long i$608506max$608683 = ((t$608682) - (((long)(1L))));
                
                //#line 29 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                long i$608677 = i$608506min$608680;
                
                //#line 29 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 29 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                    final long t$608678 = i$608677;
                    
                    //#line 29 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                    final boolean t$608679 = ((t$608678) <= (((long)(i$608506max$608683))));
                    
                    //#line 29 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                    if (!(t$608679)) {
                        
                        //#line 29 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                        break;
                    }
                    
                    //#line 29 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                    final long j$608674 = i$608677;
                    
                    //#line 30 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                    final x10.array.Array_2 t$608672 = ((x10.array.Array_2)(this.dist));
                    
                    //#line 30 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                    final int t$608673 = Hello.nextInt$O(((x10.io.Reader)(r)));
                    
                    //#line 30 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                    ((x10.array.Array_2<x10.core.Int>)t$608672).$set__2x10$array$Array_2$$T$G((long)(i$608684), (long)(j$608674), x10.core.Int.$box(t$608673));
                    
                    //#line 29 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                    final long t$608675 = i$608677;
                    
                    //#line 29 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                    final long t$608676 = ((t$608675) + (((long)(1L))));
                    
                    //#line 29 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                    i$608677 = t$608676;
                }
                
                //#line 28 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                final long t$608685 = i$608687;
                
                //#line 28 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                final long t$608686 = ((t$608685) + (((long)(1L))));
                
                //#line 28 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                i$608687 = t$608686;
            }
        }
        return this;
    }
    
    
    
    //#line 34 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
    private static int nextInt$O(final x10.io.Reader r) {
        
        //#line 35 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        final x10.util.StringBuilder sb = ((x10.util.StringBuilder)(new x10.util.StringBuilder((java.lang.System[]) null).x10$util$StringBuilder$$init$S()));
        
        //#line 36 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        boolean skip_white = true;
        
        //#line 37 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        while (true) {
            
            //#line 37 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final long t$608617 = r.available$O();
            
            //#line 37 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final boolean t$608622 = ((long) t$608617) != ((long) 0L);
            
            //#line 37 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            if (!(t$608622)) {
                
                //#line 37 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                break;
            }
            
            //#line 38 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final byte t$608694 = r.read$O();
            
            //#line 38 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final char c$608695 = ((char) (((byte)(t$608694))));
            
            //#line 39 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            boolean t$608696 = skip_white;
            
            //#line 39 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            if (t$608696) {
                
                //#line 39 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                t$608696 = java.lang.Character.isWhitespace(c$608695);
            }
            
            //#line 39 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final boolean t$608697 = t$608696;
            
            //#line 39 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            if (t$608697) {
                
                //#line 40 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                continue;
            }
            
            //#line 41 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final boolean t$608698 = java.lang.Character.isDigit(c$608695);
            
            //#line 41 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            if (t$608698) {
                
                //#line 42 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                sb.add((char)(c$608695));
                
                //#line 43 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                skip_white = false;
            } else {
                
                //#line 45 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                break;
            }
        }
        
        //#line 48 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        final java.lang.String t$608623 = sb.toString();
        
        //#line 48 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        final int t$608624 = java.lang.Integer.parseInt(t$608623);
        
        //#line 48 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        return t$608624;
    }
    
    public static int nextInt$P$O(final x10.io.Reader r) {
        return Hello.nextInt$O(((x10.io.Reader)(r)));
    }
    
    
    //#line 53 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
    public void solve() {
        
        //#line 54 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        final x10.io.Printer t$608625 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 54 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        t$608625.println(((java.lang.Object)("Hello World Tree Search ")));
        
        //#line 55 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        final int t$608626 = this.size;
        
        //#line 55 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        final x10.array.Array_2 t$608627 = ((x10.array.Array_2)(this.dist));
        
        //#line 55 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        tree_search.NRDFS search = new tree_search.NRDFS((java.lang.System[]) null).tree_search$NRDFS$$init$S(((int)(t$608626)), ((x10.array.Array_2)(t$608627)), (tree_search.NRDFS.__1$1x10$lang$Int$2) null);
        
        //#line 56 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        java.lang.String str = "|\t";
        
        //#line 57 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        final long i$608560min$608736 = 0L;
        
        //#line 57 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        final int t$608737 = this.size;
        
        //#line 57 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        final long t$608738 = ((long)(((int)(t$608737))));
        
        //#line 57 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        final long i$608560max$608739 = ((t$608738) - (((long)(1L))));
        
        //#line 57 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        long i$608717 = i$608560min$608736;
        
        //#line 57 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        for (;
             true;
             ) {
            
            //#line 57 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final long t$608718 = i$608717;
            
            //#line 57 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final boolean t$608719 = ((t$608718) <= (((long)(i$608560max$608739))));
            
            //#line 57 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            if (!(t$608719)) {
                
                //#line 57 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                break;
            }
            
            //#line 57 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final long i$608714 = i$608717;
            
            //#line 59 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final long i$608542min$608710 = 0L;
            
            //#line 59 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final int t$608711 = this.size;
            
            //#line 59 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final long t$608712 = ((long)(((int)(t$608711))));
            
            //#line 59 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final long i$608542max$608713 = ((t$608712) - (((long)(1L))));
            
            //#line 59 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            long i$608707 = i$608542min$608710;
            
            //#line 59 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            for (;
                 true;
                 ) {
                
                //#line 59 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                final long t$608708 = i$608707;
                
                //#line 59 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                final boolean t$608709 = ((t$608708) <= (((long)(i$608542max$608713))));
                
                //#line 59 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                if (!(t$608709)) {
                    
                    //#line 59 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                    break;
                }
                
                //#line 59 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                final long j$608704 = i$608707;
                
                //#line 60 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                final java.lang.String t$608699 = ((java.lang.String)(str));
                
                //#line 60 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                final x10.array.Array_2 t$608700 = ((x10.array.Array_2)(this.dist));
                
                //#line 60 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                final int t$608701 = x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t$608700).$apply$G((long)(i$608714), (long)(j$608704)));
                
                //#line 60 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                final java.lang.String t$608702 = (((x10.core.Int.$box(t$608701))) + ("\t"));
                
                //#line 60 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                final java.lang.String t$608703 = ((t$608699) + (t$608702));
                
                //#line 60 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                str = ((java.lang.String)(t$608703));
                
                //#line 59 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                final long t$608705 = i$608707;
                
                //#line 59 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                final long t$608706 = ((t$608705) + (((long)(1L))));
                
                //#line 59 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                i$608707 = t$608706;
            }
            
            //#line 63 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            str = ((java.lang.String)("|\t"));
            
            //#line 57 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final long t$608715 = i$608717;
            
            //#line 57 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final long t$608716 = ((t$608715) + (((long)(1L))));
            
            //#line 57 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            i$608717 = t$608716;
        }
        
        //#line 65 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        final long i$608578min$608740 = 1L;
        
        //#line 65 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        final int t$608741 = this.size;
        
        //#line 65 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        final long t$608742 = ((long)(((int)(t$608741))));
        
        //#line 65 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        final long i$608578max$608743 = ((t$608742) - (((long)(1L))));
        
        //#line 65 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        long i$608733 = i$608578min$608740;
        
        //#line 65 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        for (;
             true;
             ) {
            
            //#line 65 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final long t$608734 = i$608733;
            
            //#line 65 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final boolean t$608735 = ((t$608734) <= (((long)(i$608578max$608743))));
            
            //#line 65 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            if (!(t$608735)) {
                
                //#line 65 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
                break;
            }
            
            //#line 65 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final long i$608730 = i$608733;
            
            //#line 66 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            x10.util.ArrayList mArray$608720 = new x10.util.ArrayList<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).x10$util$ArrayList$$init$S();
            
            //#line 67 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final x10.util.ArrayList t$608721 = ((x10.util.ArrayList)(mArray$608720));
            
            //#line 67 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final int t$608722 = ((int)(long)(((long)(0L))));
            
            //#line 67 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            ((x10.util.ArrayList<x10.core.Int>)t$608721).add__0x10$util$ArrayList$$T$O(x10.core.Int.$box(t$608722));
            
            //#line 68 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final x10.util.ArrayList t$608723 = ((x10.util.ArrayList)(mArray$608720));
            
            //#line 68 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final int t$608724 = ((int)(long)(((long)(i$608730))));
            
            //#line 68 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            ((x10.util.ArrayList<x10.core.Int>)t$608723).add__0x10$util$ArrayList$$T$O(x10.core.Int.$box(t$608724));
            
            //#line 69 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final x10.util.ArrayList t$608725 = ((x10.util.ArrayList)(mArray$608720));
            
            //#line 69 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final int t$608726 = this.size;
            
            //#line 69 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            tree_search.Tour tour$608727 = new tree_search.Tour((java.lang.System[]) null).tree_search$Tour$$init$S(t$608725, ((int)(t$608726)), (tree_search.Tour.__0$1x10$lang$Int$2) null);
            
            //#line 70 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final tree_search.NRDFS t$608728 = ((tree_search.NRDFS)(search));
            
            //#line 70 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final tree_search.Tour t$608729 = ((tree_search.Tour)(tour$608727));
            
            //#line 70 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            t$608728.addTour(((tree_search.Tour)(t$608729)));
            
            //#line 65 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final long t$608731 = i$608733;
            
            //#line 65 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            final long t$608732 = ((t$608731) + (((long)(1L))));
            
            //#line 65 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
            i$608733 = t$608732;
        }
        
        //#line 73 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        long start_time = x10.lang.System.currentTimeMillis$O();
        
        //#line 74 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        final x10.io.Printer t$608662 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 74 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        t$608662.println(((java.lang.Object)("Start salesman problem")));
        
        //#line 75 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        final tree_search.NRDFS t$608663 = ((tree_search.NRDFS)(search));
        
        //#line 75 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        t$608663.Solve();
        
        //#line 76 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        long finish_time = x10.lang.System.currentTimeMillis$O();
        
        //#line 77 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        final x10.io.Printer t$608668 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 77 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        final long t$608664 = finish_time;
        
        //#line 77 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        final long t$608665 = start_time;
        
        //#line 77 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        final long t$608666 = ((t$608664) - (((long)(t$608665))));
        
        //#line 77 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        final java.lang.String t$608667 = (("Finished in ") + ((x10.core.Long.$box(t$608666))));
        
        //#line 77 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        final java.lang.String t$608669 = ((t$608667) + (" miliseconds"));
        
        //#line 77 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        t$608668.println(((java.lang.Object)(t$608669)));
    }
    
    
    //#line 80 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
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
            Hello.main(args);
        }
    }
    
    // the original app-main method
    public static void main(final x10.core.Rail<java.lang.String> args) {
        
        //#line 82 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        final x10.io.File f = ((x10.io.File)(new x10.io.File((java.lang.System[]) null).x10$io$File$$init$S(((java.lang.String)("uk12_dist.txt")))));
        
        //#line 83 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        final x10.io.FileReader fr = ((x10.io.FileReader)(new x10.io.FileReader((java.lang.System[]) null).x10$io$FileReader$$init$S(((x10.io.File)(f)))));
        
        //#line 84 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        Hello tsp = new Hello((java.lang.System[]) null).Hello$$init$S(((x10.io.Reader)(fr)));
        
        //#line 85 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        final Hello t$608670 = ((Hello)(tsp));
        
        //#line 85 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        t$608670.solve();
        
        //#line 86 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        final x10.io.Printer t$608671 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 86 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        t$608671.println(((java.lang.Object)("Finished")));
    }
    
    
    //#line 20 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
    final public Hello Hello$$this$Hello() {
        
        //#line 20 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
        return Hello.this;
    }
    
    
    //#line 20 "C:/Users/schirmer/Desktop/x10/tree_search_seq/src/Hello.x10"
    final public void __fieldInitializers_Hello() {
        
    }
}

