package l.M.x;

import java.util.ArrayList;
import java.util.List;

public class v__ extends v {
   // $FF: synthetic field
   public String _;
   // $FF: synthetic field
   public List<Object> µv8;
   // $FF: synthetic field
   private static int V;
   // $FF: synthetic field
   private static boolean M;
   // $FF: synthetic field
   private static final int R;
   // $FF: synthetic field
   private static final int j;
   // $FF: synthetic field
   private static final int L;
   // $FF: synthetic field
   private static final int X;
   // $FF: synthetic field
   private static final int X3;
   // $FF: synthetic field
   private static final int A;
   // $FF: synthetic field
   private static final int VY;
   // $FF: synthetic field
   private static final int c;
   // $FF: synthetic field
   private static final int xz;
   // $FF: synthetic field
   private static final int P;
   // $FF: synthetic field
   private static final int i;
   // $FF: synthetic field
   private static final int N;
   // $FF: synthetic field
   private static final int MX;
   // $FF: synthetic field
   private static final int p;
   // $FF: synthetic field
   private static final int pz;
   // $FF: synthetic field
   private static final int Z4;
   // $FF: synthetic field
   private static final int I;
   // $FF: synthetic field
   private static final int Rn;

   // $FF: synthetic method
   static void v(v var0, String var1, Object var2) {
      if (var0 != null) {
         if (var2 instanceof String[]) {
            String[] var3 = (String[])var2;
            var0.v(var1, var3[Z4], var3[I]);
            if (!M) {
               throw null;
            }
         } else if (var2 instanceof v__) {
            v__ var7 = (v__)var2;
            var7.v(var0.v(var1, var7._));
            if (V < 0) {
               throw null;
            }
         } else if (var2 instanceof List) {
            v var8 = var0.v(var1);
            if (var8 != null) {
               List var4 = (List)var2;
               int var5 = Rn;
               int var6 = var4.size();

               while(var5 < var6) {
                  v((v)var8, (String)null, (Object)var4.get(var5));
                  ++var5;
                  if (!M) {
                     throw null;
                  }
               }

               var8._v();
            }

            if (!M) {
               throw null;
            }
         } else {
            var0.v(var1, var2);
         }
      }

   }

   // $FF: synthetic method
   public void v(int var1) {
   }

   // $FF: synthetic method
   public void v(String var1, String var2, String var3) {
      if (this.µv8 == null) {
         ArrayList var10001 = new ArrayList;
         int var10003;
         if (this._ != null) {
            var10003 = X3;
            if (V < 0) {
               throw null;
            }
         } else {
            var10003 = A;
         }

         var10001.<init>(var10003);
         this.µv8 = var10001;
      }

      if (this._ != null) {
         this.µv8.add(var1);
      }

      List var10000 = this.µv8;
      String[] var4 = new String[VY];
      var4[c] = var2;
      var4[xz] = var3;
      var10000.add(var4);
   }

   // $FF: synthetic method
   public v v(String var1, String var2) {
      if (this.µv8 == null) {
         ArrayList var10001 = new ArrayList;
         int var10003;
         if (this._ != null) {
            var10003 = P;
            if (V < 0) {
               throw null;
            }
         } else {
            var10003 = i;
         }

         var10001.<init>(var10003);
         this.µv8 = var10001;
      }

      if (this._ != null) {
         this.µv8.add(var1);
      }

      v__ var3 = new v__(var2);
      this.µv8.add(var3);
      return var3;
   }

   // $FF: synthetic method
   public v__(String var1) {
      this(R, var1);
      if (this.getClass() != v__.class) {
         throw new IllegalStateException();
      }
   }

   // $FF: synthetic method
   public v__(int var1, String var2) {
      super(var1);
      this._ = var2;
   }

   // $FF: synthetic method
   public void v(String var1, Object var2) {
      if (this.µv8 == null) {
         ArrayList var10001 = new ArrayList;
         int var10003;
         if (this._ != null) {
            var10003 = L;
            if (!M) {
               throw null;
            }
         } else {
            var10003 = X;
         }

         var10001.<init>(var10003);
         this.µv8 = var10001;
      }

      if (this._ != null) {
         this.µv8.add(var1);
      }

      if (var2 instanceof byte[]) {
         this.µv8.add(v_µ.v((byte[])var2));
         if (!M) {
            throw null;
         }
      } else if (var2 instanceof boolean[]) {
         this.µv8.add(v_µ.v((boolean[])var2));
         if (!M) {
            throw null;
         }
      } else if (var2 instanceof short[]) {
         this.µv8.add(v_µ.v((short[])var2));
         if (V < 0) {
            throw null;
         }
      } else if (var2 instanceof char[]) {
         this.µv8.add(v_µ.v((char[])var2));
         if (!M) {
            throw null;
         }
      } else if (var2 instanceof int[]) {
         this.µv8.add(v_µ.v((int[])var2));
         if (V < 0) {
            throw null;
         }
      } else if (var2 instanceof long[]) {
         this.µv8.add(v_µ.v((long[])var2));
         if (V < 0) {
            throw null;
         }
      } else if (var2 instanceof float[]) {
         this.µv8.add(v_µ.v((float[])var2));
         if (!M) {
            throw null;
         }
      } else if (var2 instanceof double[]) {
         this.µv8.add(v_µ.v((double[])var2));
         if (V < 0) {
            throw null;
         }
      } else {
         this.µv8.add(var2);
      }

   }

   // $FF: synthetic method
   public void _v() {
   }

   // $FF: synthetic method
   public v v(String var1) {
      if (this.µv8 == null) {
         ArrayList var10001 = new ArrayList;
         int var10003;
         if (this._ != null) {
            var10003 = N;
            if (!M) {
               throw null;
            }
         } else {
            var10003 = MX;
         }

         var10001.<init>(var10003);
         this.µv8 = var10001;
      }

      if (this._ != null) {
         this.µv8.add(var1);
      }

      ArrayList var2 = new ArrayList();
      this.µv8.add(var2);
      return new v__(var2);
   }

   static {
      int var10002 = U.o(-1712465427);
      int var10001 = 132071879;
      R = var10002 ^ -1215121511;
      j = 150994944 >>> 200 | 150994944 << ~200 + 1;
      var10001 = -1770251588;
      L = -969616581 ^ U.o(-1664406429);
      var10001 = -740114736;
      X = 1600730373 ^ U.N(-632471273, -709221402);
      X3 = (1 >>> U.o(-16777216) | 1 << ~255 + 1) & -1;
      A = (67108864 >>> 186 | 67108864 << -U.o(1560281088)) & -1;
      var10001 = 1049253956;
      VY = (1362369330 ^ U.o(215493770)) & -1;
      var10002 = U.o(-75585336);
      var10001 = 461843879;
      c = var10002 ^ 320175839;
      var10001 = -1114559250;
      xz = (-1731552682 ^ -1731552681) & -1;
      var10002 = U.o(1754786457);
      var10001 = -127317877;
      P = var10002 ^ U.N(-1085758262, 298549579);
      var10002 = U.N(-2053054569, -1152496941);
      var10001 = -2143552835;
      i = var10002 ^ U.N(1875624660, -2004063582);
      var10002 = U.o(1174672604);
      var10001 = -1027638660;
      N = (var10002 ^ 992485472) & -1;
      var10001 = -1818067046;
      MX = 1289219107 ^ 1289219106;
      var10002 = U.o(-1949982969);
      var10001 = 1789782729;
      p = var10002 ^ U.N(-1707270641, -1177269748);
      pz = 8388608 >>> 183 | 8388608 << -U.o(-318767104);
      var10002 = U.o(1142666866);
      var10001 = 2060044306;
      Z4 = var10002 ^ 1315821602;
      var10002 = U.o(-2140525946);
      var10001 = -1374551820;
      I = var10002 ^ 1632916992;
      var10002 = U.o(1985932826);
      var10001 = 132930220;
      Rn = var10002 ^ 1484225134;
   }

   // $FF: synthetic method
   v__(List<Object> var1) {
      super(j);
      this.µv8 = var1;
   }

   // $FF: synthetic method
   public void v(v var1) {
      if (var1 != null) {
         if (this.µv8 != null) {
            int var2 = p;
            int var3 = this.µv8.size();

            while(var2 < var3) {
               String var4 = (String)this.µv8.get(var2);
               Object var5 = this.µv8.get(var2 + pz);
               v(var1, var4, var5);
               var2 += 2;
               if (!M) {
                  throw null;
               }
            }
         }

         var1._v();
      }

   }
}
