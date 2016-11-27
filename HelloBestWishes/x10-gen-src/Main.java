/**
 * The canonical "Hello, World" demo class expressed in X10
 */
@x10.runtime.impl.java.X10Generated
public class Main extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Main> $RTT = 
        x10.rtt.NamedType.<Main> make("Main",
                                      Main.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(Main $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Main.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        Main $_obj = new Main((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public Main(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 9 "F:/GitHub/x10_tutorial/HelloBestWishes/src/Main.x10"
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
            Main.main(args);
        }
    }
    
    // the original app-main method
    public static void main(final x10.core.Rail<java.lang.String> args) {
        {
            
            //#line 10 "F:/GitHub/x10_tutorial/HelloBestWishes/src/Main.x10"
            x10.xrx.Runtime.ensureNotInAtomic();
            
            //#line 10 "F:/GitHub/x10_tutorial/HelloBestWishes/src/Main.x10"
            final x10.xrx.FinishState fs$511 = x10.xrx.Runtime.startFinish();
            
            //#line 10 "F:/GitHub/x10_tutorial/HelloBestWishes/src/Main.x10"
            try {{
                {
                    
                    //#line 10 "F:/GitHub/x10_tutorial/HelloBestWishes/src/Main.x10"
                    final x10.lang.PlaceGroup t$491 = ((x10.lang.PlaceGroup)(x10.lang.Place.places()));
                    
                    //#line 10 "F:/GitHub/x10_tutorial/HelloBestWishes/src/Main.x10"
                    final x10.lang.Iterator p$489 = ((x10.lang.Iterable<x10.lang.Place>)t$491).iterator();
                    
                    //#line 10 "F:/GitHub/x10_tutorial/HelloBestWishes/src/Main.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 10 "F:/GitHub/x10_tutorial/HelloBestWishes/src/Main.x10"
                        final boolean t$497 = ((x10.lang.Iterator<x10.lang.Place>)p$489).hasNext$O();
                        
                        //#line 10 "F:/GitHub/x10_tutorial/HelloBestWishes/src/Main.x10"
                        if (!(t$497)) {
                            
                            //#line 10 "F:/GitHub/x10_tutorial/HelloBestWishes/src/Main.x10"
                            break;
                        }
                        
                        //#line 10 "F:/GitHub/x10_tutorial/HelloBestWishes/src/Main.x10"
                        final x10.lang.Place p$499 = ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)p$489).next$G()));
                        
                        //#line 11 "F:/GitHub/x10_tutorial/HelloBestWishes/src/Main.x10"
                        x10.xrx.Runtime.runAsync(((x10.lang.Place)(p$499)), ((x10.core.fun.VoidFun_0_0)(new Main.$Closure$0(args, p$499, (Main.$Closure$0.__0$1x10$lang$String$2) null))), ((x10.xrx.Runtime.Profile)(null)));
                    }
                }
            }}catch (java.lang.Throwable ct$509) {
                
                //#line 10 "F:/GitHub/x10_tutorial/HelloBestWishes/src/Main.x10"
                x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$509)));
                
                //#line 10 "F:/GitHub/x10_tutorial/HelloBestWishes/src/Main.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 10 "F:/GitHub/x10_tutorial/HelloBestWishes/src/Main.x10"
                 x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$511)));
             }}
            }
        
        //#line 13 "F:/GitHub/x10_tutorial/HelloBestWishes/src/Main.x10"
        final x10.io.Printer t$498 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 13 "F:/GitHub/x10_tutorial/HelloBestWishes/src/Main.x10"
        t$498.println(((java.lang.Object)("Goodbye")));
        }
    
    
    //#line 4 "F:/GitHub/x10_tutorial/HelloBestWishes/src/Main.x10"
    final public Main Main$$this$Main() {
        
        //#line 4 "F:/GitHub/x10_tutorial/HelloBestWishes/src/Main.x10"
        return Main.this;
    }
    
    
    //#line 4 "F:/GitHub/x10_tutorial/HelloBestWishes/src/Main.x10"
    // creation method for java code (1-phase java constructor)
    public Main() {
        this((java.lang.System[]) null);
        Main$$init$S();
    }
    
    // constructor for non-virtual call
    final public Main Main$$init$S() {
         {
            
            //#line 4 "F:/GitHub/x10_tutorial/HelloBestWishes/src/Main.x10"
            
            
            //#line 4 "F:/GitHub/x10_tutorial/HelloBestWishes/src/Main.x10"
            this.__fieldInitializers_Main();
        }
        return this;
    }
    
    
    
    //#line 4 "F:/GitHub/x10_tutorial/HelloBestWishes/src/Main.x10"
    final public void __fieldInitializers_Main() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$0 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$0> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$0> make($Closure$0.class,
                                                        new x10.rtt.Type[] {
                                                            x10.core.fun.VoidFun_0_0.$RTT
                                                        });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(Main.$Closure$0 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$0.class + " calling"); } 
            $_obj.args = $deserializer.readObject();
            $_obj.p$499 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            Main.$Closure$0 $_obj = new Main.$Closure$0((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.args);
            $serializer.write(this.p$499);
            
        }
        
        // constructor just for allocation
        public $Closure$0(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$String$2 {}
        
    
        
        public void $apply() {
            
            //#line 11 "F:/GitHub/x10_tutorial/HelloBestWishes/src/Main.x10"
            try {{
                
                //#line 11 "F:/GitHub/x10_tutorial/HelloBestWishes/src/Main.x10"
                final x10.io.Printer t$500 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
                //#line 11 "F:/GitHub/x10_tutorial/HelloBestWishes/src/Main.x10"
                final java.lang.String t$501 = ((java.lang.String[])this.args.value)[(int)0L];
                
                //#line 11 "F:/GitHub/x10_tutorial/HelloBestWishes/src/Main.x10"
                final java.lang.String t$502 = ((t$501) + (" from place "));
                
                //#line 11 "F:/GitHub/x10_tutorial/HelloBestWishes/src/Main.x10"
                final long t$503 = this.p$499.id;
                
                //#line 11 "F:/GitHub/x10_tutorial/HelloBestWishes/src/Main.x10"
                final java.lang.String t$504 = ((t$502) + ((x10.core.Long.$box(t$503))));
                
                //#line 11 "F:/GitHub/x10_tutorial/HelloBestWishes/src/Main.x10"
                t$500.println(((java.lang.Object)(t$504)));
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 11 "F:/GitHub/x10_tutorial/HelloBestWishes/src/Main.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 11 "F:/GitHub/x10_tutorial/HelloBestWishes/src/Main.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public x10.core.Rail<java.lang.String> args;
        public x10.lang.Place p$499;
        
        public $Closure$0(final x10.core.Rail<java.lang.String> args, final x10.lang.Place p$499, __0$1x10$lang$String$2 $dummy) {
             {
                this.args = ((x10.core.Rail)(args));
                this.p$499 = ((x10.lang.Place)(p$499));
            }
        }
        
    }
    
    }
    
    