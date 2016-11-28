package tree_search;


@x10.runtime.impl.java.X10Generated
public class Main extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Main> $RTT = 
        x10.rtt.NamedType.<Main> make("tree_search.Main",
                                      Main.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(tree_search.Main $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Main.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        tree_search.Main $_obj = new tree_search.Main((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public Main(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 11 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Main.x10"
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
            
            //#line 12 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Main.x10"
            x10.xrx.Runtime.ensureNotInAtomic();
            
            //#line 12 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Main.x10"
            final x10.xrx.FinishState fs$2198 = x10.xrx.Runtime.startFinish();
            
            //#line 12 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Main.x10"
            try {{
                {
                    
                    //#line 12 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Main.x10"
                    final x10.lang.PlaceGroup t$2178 = ((x10.lang.PlaceGroup)(x10.lang.Place.places()));
                    
                    //#line 12 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Main.x10"
                    final x10.lang.Iterator p$2176 = ((x10.lang.Iterable<x10.lang.Place>)t$2178).iterator();
                    
                    //#line 12 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Main.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 12 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Main.x10"
                        final boolean t$2184 = ((x10.lang.Iterator<x10.lang.Place>)p$2176).hasNext$O();
                        
                        //#line 12 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Main.x10"
                        if (!(t$2184)) {
                            
                            //#line 12 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Main.x10"
                            break;
                        }
                        
                        //#line 12 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Main.x10"
                        final x10.lang.Place p$2186 = ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)p$2176).next$G()));
                        
                        //#line 13 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Main.x10"
                        x10.xrx.Runtime.runAsync(((x10.lang.Place)(p$2186)), ((x10.core.fun.VoidFun_0_0)(new tree_search.Main.$Closure$1(args, p$2186, (tree_search.Main.$Closure$1.__0$1x10$lang$String$2) null))), ((x10.xrx.Runtime.Profile)(null)));
                    }
                }
            }}catch (java.lang.Throwable ct$2196) {
                
                //#line 12 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Main.x10"
                x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$2196)));
                
                //#line 12 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Main.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 12 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Main.x10"
                 x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$2198)));
             }}
            }
        
        //#line 15 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Main.x10"
        final x10.io.Printer t$2185 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 15 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Main.x10"
        t$2185.println(((java.lang.Object)("Goodbye")));
        }
    
    
    //#line 9 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Main.x10"
    final public tree_search.Main tree_search$Main$$this$tree_search$Main() {
        
        //#line 9 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Main.x10"
        return tree_search.Main.this;
    }
    
    
    //#line 9 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Main.x10"
    // creation method for java code (1-phase java constructor)
    public Main() {
        this((java.lang.System[]) null);
        tree_search$Main$$init$S();
    }
    
    // constructor for non-virtual call
    final public tree_search.Main tree_search$Main$$init$S() {
         {
            
            //#line 9 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Main.x10"
            
            
            //#line 9 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Main.x10"
            this.__fieldInitializers_tree_search_Main();
        }
        return this;
    }
    
    
    
    //#line 9 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Main.x10"
    final public void __fieldInitializers_tree_search_Main() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$1 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$1> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$1> make($Closure$1.class,
                                                        new x10.rtt.Type[] {
                                                            x10.core.fun.VoidFun_0_0.$RTT
                                                        });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(tree_search.Main.$Closure$1 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$1.class + " calling"); } 
            $_obj.args = $deserializer.readObject();
            $_obj.p$2186 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            tree_search.Main.$Closure$1 $_obj = new tree_search.Main.$Closure$1((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.args);
            $serializer.write(this.p$2186);
            
        }
        
        // constructor just for allocation
        public $Closure$1(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$String$2 {}
        
    
        
        public void $apply() {
            
            //#line 13 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Main.x10"
            try {{
                
                //#line 13 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Main.x10"
                final x10.io.Printer t$2187 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
                //#line 13 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Main.x10"
                final java.lang.String t$2188 = ((java.lang.String[])this.args.value)[(int)0L];
                
                //#line 13 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Main.x10"
                final java.lang.String t$2189 = ((t$2188) + (" from place "));
                
                //#line 13 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Main.x10"
                final long t$2190 = this.p$2186.id;
                
                //#line 13 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Main.x10"
                final java.lang.String t$2191 = ((t$2189) + ((x10.core.Long.$box(t$2190))));
                
                //#line 13 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Main.x10"
                t$2187.println(((java.lang.Object)(t$2191)));
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 13 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Main.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 13 "F:/GitHub/x10_tutorial/tree_search/src/tree_search/Main.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public x10.core.Rail<java.lang.String> args;
        public x10.lang.Place p$2186;
        
        public $Closure$1(final x10.core.Rail<java.lang.String> args, final x10.lang.Place p$2186, __0$1x10$lang$String$2 $dummy) {
             {
                this.args = ((x10.core.Rail)(args));
                this.p$2186 = ((x10.lang.Place)(p$2186));
            }
        }
        
    }
    
    }
    
    