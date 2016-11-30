
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
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        Hello $_obj = new Hello((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public Hello(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 11 "F:/GitHub/inf2591/tree_search/src/Hello.x10"
    /**
     * The main method for the Hello class
     */
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
    public static void main(final x10.core.Rail<java.lang.String> id$101251) {
        {
            
            //#line 12 "F:/GitHub/inf2591/tree_search/src/Hello.x10"
            x10.xrx.Runtime.ensureNotInAtomic();
            
            //#line 12 "F:/GitHub/inf2591/tree_search/src/Hello.x10"
            final x10.xrx.FinishState fs$101525 = x10.xrx.Runtime.startFinish();
            
            //#line 12 "F:/GitHub/inf2591/tree_search/src/Hello.x10"
            try {{
                {
                    
                    //#line 12 "F:/GitHub/inf2591/tree_search/src/Hello.x10"
                    final x10.lang.PlaceGroup t$101507 = ((x10.lang.PlaceGroup)(x10.lang.Place.places()));
                    
                    //#line 12 "F:/GitHub/inf2591/tree_search/src/Hello.x10"
                    final x10.lang.Iterator p$101505 = ((x10.lang.Iterable<x10.lang.Place>)t$101507).iterator();
                    
                    //#line 12 "F:/GitHub/inf2591/tree_search/src/Hello.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 12 "F:/GitHub/inf2591/tree_search/src/Hello.x10"
                        final boolean t$101511 = ((x10.lang.Iterator<x10.lang.Place>)p$101505).hasNext$O();
                        
                        //#line 12 "F:/GitHub/inf2591/tree_search/src/Hello.x10"
                        if (!(t$101511)) {
                            
                            //#line 12 "F:/GitHub/inf2591/tree_search/src/Hello.x10"
                            break;
                        }
                        
                        //#line 12 "F:/GitHub/inf2591/tree_search/src/Hello.x10"
                        final x10.lang.Place p$101515 = ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)p$101505).next$G()));
                        
                        //#line 13 "F:/GitHub/inf2591/tree_search/src/Hello.x10"
                        x10.xrx.Runtime.runAsync(((x10.lang.Place)(p$101515)), ((x10.core.fun.VoidFun_0_0)(new Hello.$Closure$2(p$101515))), ((x10.xrx.Runtime.Profile)(null)));
                    }
                }
            }}catch (java.lang.Throwable ct$101523) {
                
                //#line 12 "F:/GitHub/inf2591/tree_search/src/Hello.x10"
                x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$101523)));
                
                //#line 12 "F:/GitHub/inf2591/tree_search/src/Hello.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 12 "F:/GitHub/inf2591/tree_search/src/Hello.x10"
                 x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$101525)));
             }}
            }
        
        //#line 16 "F:/GitHub/inf2591/tree_search/src/Hello.x10"
        final tree_search.RDFS dfs = new tree_search.RDFS((java.lang.System[]) null).tree_search$RDFS$$init$S();
        
        //#line 17 "F:/GitHub/inf2591/tree_search/src/Hello.x10"
        final x10.io.Printer t$101513 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 17 "F:/GitHub/inf2591/tree_search/src/Hello.x10"
        final double t$101512 = dfs.magnitude$O();
        
        //#line 17 "F:/GitHub/inf2591/tree_search/src/Hello.x10"
        final java.lang.String t$101514 = (("Magnitude ") + ((x10.core.Double.$box(t$101512))));
        
        //#line 17 "F:/GitHub/inf2591/tree_search/src/Hello.x10"
        t$101513.println(((java.lang.Object)(t$101514)));
        }
    
    
    //#line 6 "F:/GitHub/inf2591/tree_search/src/Hello.x10"
    final public Hello Hello$$this$Hello() {
        
        //#line 6 "F:/GitHub/inf2591/tree_search/src/Hello.x10"
        return Hello.this;
    }
    
    
    //#line 6 "F:/GitHub/inf2591/tree_search/src/Hello.x10"
    // creation method for java code (1-phase java constructor)
    public Hello() {
        this((java.lang.System[]) null);
        Hello$$init$S();
    }
    
    // constructor for non-virtual call
    final public Hello Hello$$init$S() {
         {
            
            //#line 6 "F:/GitHub/inf2591/tree_search/src/Hello.x10"
            
            
            //#line 6 "F:/GitHub/inf2591/tree_search/src/Hello.x10"
            this.__fieldInitializers_Hello();
        }
        return this;
    }
    
    
    
    //#line 6 "F:/GitHub/inf2591/tree_search/src/Hello.x10"
    final public void __fieldInitializers_Hello() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$2 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$2> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$2> make($Closure$2.class,
                                                        new x10.rtt.Type[] {
                                                            x10.core.fun.VoidFun_0_0.$RTT
                                                        });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(Hello.$Closure$2 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$2.class + " calling"); } 
            $_obj.p$101515 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            Hello.$Closure$2 $_obj = new Hello.$Closure$2((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.p$101515);
            
        }
        
        // constructor just for allocation
        public $Closure$2(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 13 "F:/GitHub/inf2591/tree_search/src/Hello.x10"
            try {{
                
                //#line 13 "F:/GitHub/inf2591/tree_search/src/Hello.x10"
                final x10.io.Printer t$101516 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
                //#line 13 "F:/GitHub/inf2591/tree_search/src/Hello.x10"
                final long t$101517 = this.p$101515.id;
                
                //#line 13 "F:/GitHub/inf2591/tree_search/src/Hello.x10"
                final java.lang.String t$101518 = (("Hello World Tree Search from place ") + ((x10.core.Long.$box(t$101517))));
                
                //#line 13 "F:/GitHub/inf2591/tree_search/src/Hello.x10"
                t$101516.println(((java.lang.Object)(t$101518)));
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 13 "F:/GitHub/inf2591/tree_search/src/Hello.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 13 "F:/GitHub/inf2591/tree_search/src/Hello.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public x10.lang.Place p$101515;
        
        public $Closure$2(final x10.lang.Place p$101515) {
             {
                this.p$101515 = ((x10.lang.Place)(p$101515));
            }
        }
        
    }
    
    }
    
    