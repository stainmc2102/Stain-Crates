package l.M.x;

import java.util.ArrayList;
import java.util.List;

final class v_µ {
   // $FF: synthetic field
   private static int qZ;
   // $FF: synthetic field
   private static boolean q;
   // $FF: synthetic field
   private static final int J = 32 >>> U.o(-1593835520) | 32 << ~U.N(532, -179491518) + 1;
   // $FF: synthetic field
   private static final int vp;
   // $FF: synthetic field
   private static final int b;
   // $FF: synthetic field
   private static final int d;
   // $FF: synthetic field
   private static final int k;
   // $FF: synthetic field
   private static final int S;
   // $FF: synthetic field
   private static final int e1;
   // $FF: synthetic field
   private static final int NA;
   // $FF: synthetic field
   private static final int kS;
   // $FF: synthetic field
   private static final int x;
   // $FF: synthetic field
   private static final int I;
   // $FF: synthetic field
   private static final int q7;

   // $FF: synthetic method
   static <T> List<T> v(List<T> var0, T var1) {
      Object var10000;
      if (var0 == null) {
         var10000 = new ArrayList(J);
         if (q) {
            throw null;
         }
      } else {
         var10000 = var0;
      }

      Object var2 = var10000;
      ((List)var2).add(var1);
      return (List)var2;
   }

   // $FF: synthetic method
   static List<Integer> v(int[] var0) {
      if (var0 == null) {
         return new ArrayList();
      } else {
         ArrayList var1 = new ArrayList(var0.length);
         int[] var2 = var0;
         int var3 = var0.length;
         int var4 = NA;

         do {
            if (var4 >= var3) {
               return var1;
            }

            int var5 = var2[var4];
            var1.add(var5);
            ++var4;
         } while(qZ < 0);

         throw null;
      }
   }

   // $FF: synthetic method
   static List<Character> v(char[] var0) {
      if (var0 == null) {
         return new ArrayList();
      } else {
         ArrayList var1 = new ArrayList(var0.length);
         char[] var2 = var0;
         int var3 = var0.length;
         int var4 = e1;

         do {
            if (var4 >= var3) {
               return var1;
            }

            char var5 = var2[var4];
            var1.add(var5);
            ++var4;
         } while(qZ < 0);

         throw null;
      }
   }

   // $FF: synthetic method
   static List<Double> v(double[] var0) {
      if (var0 == null) {
         return new ArrayList();
      } else {
         ArrayList var1 = new ArrayList(var0.length);
         double[] var2 = var0;
         int var3 = var0.length;
         int var4 = I;

         do {
            if (var4 >= var3) {
               return var1;
            }

            double var5 = var2[var4];
            var1.add(var5);
            ++var4;
         } while(!q);

         throw null;
      }
   }

   static {
      int var10002 = U.o(-403631573);
      int var10001 = -2103265534;
      vp = var10002 ^ U.N(1149828733, 1614419940);
      var10002 = U.o(-955591781);
      var10001 = 387983555;
      b = var10002 ^ -640986909;
      var10002 = U.o(1650344395);
      var10001 = -2039447353;
      d = var10002 ^ -746423738;
      var10002 = U.o(-559327670);
      var10001 = 1950456658;
      k = var10002 ^ U.N(-1112984246, 396533335);
      var10002 = U.o(-164901757);
      var10001 = 1415797178;
      S = var10002 ^ -1053567889;
      var10002 = U.o(-2106510865);
      var10001 = -155854177;
      e1 = var10002 ^ -141783487;
      var10002 = U.o(-375190313);
      var10001 = 1333090531;
      NA = var10002 ^ -349125225;
      var10002 = U.o(297126354);
      var10001 = -106830649;
      kS = var10002 ^ 1267969416;
      var10002 = U.o(-2044907658);
      var10001 = 592392984;
      x = var10002 ^ 1861531745;
      var10002 = U.o(-1505105086);
      var10001 = -168948939;
      I = (var10002 ^ 1121423973) & -1;
      var10002 = U.o(326685501);
      var10001 = -1587690224;
      q7 = var10002 ^ -1127539000;
   }

   // $FF: synthetic method
   static <T> List<T> v(int var0) {
      ArrayList var1 = new ArrayList(var0);
      int var2 = vp;

      do {
         if (var2 >= var0) {
            return var1;
         }

         var1.add((Object)null);
         ++var2;
      } while(qZ < 0);

      throw null;
   }

   // $FF: synthetic method
   static <T> List<T> v(int var0, T[] var1) {
      ArrayList var2 = new ArrayList(var0);
      int var3 = q7;

      do {
         if (var3 >= var0) {
            return var2;
         }

         var2.add(var1[var3]);
         ++var3;
      } while(qZ < 0);

      throw null;
   }

   // $FF: synthetic method
   static <T> List<T> v(T[] var0) {
      if (var0 == null) {
         return new ArrayList();
      } else {
         ArrayList var1 = new ArrayList(var0.length);
         Object[] var2 = var0;
         int var3 = var0.length;
         int var4 = b;

         do {
            if (var4 >= var3) {
               return var1;
            }

            Object var5 = var2[var4];
            var1.add(var5);
            ++var4;
         } while(!q);

         throw null;
      }
   }

   // $FF: synthetic method
   static List<Short> v(short[] var0) {
      if (var0 == null) {
         return new ArrayList();
      } else {
         ArrayList var1 = new ArrayList(var0.length);
         short[] var2 = var0;
         int var3 = var0.length;
         int var4 = S;

         do {
            if (var4 >= var3) {
               return var1;
            }

            short var5 = var2[var4];
            var1.add(var5);
            ++var4;
         } while(qZ < 0);

         throw null;
      }
   }

   // $FF: synthetic method
   private v_µ() {
   }

   // $FF: synthetic method
   static List<Boolean> v(boolean[] var0) {
      if (var0 == null) {
         return new ArrayList();
      } else {
         ArrayList var1 = new ArrayList(var0.length);
         boolean[] var2 = var0;
         int var3 = var0.length;
         int var4 = k;

         do {
            if (var4 >= var3) {
               return var1;
            }

            boolean var5 = var2[var4];
            var1.add(var5);
            ++var4;
         } while(qZ < 0);

         throw null;
      }
   }

   // $FF: synthetic method
   static List<Long> v(long[] var0) {
      if (var0 == null) {
         return new ArrayList();
      } else {
         ArrayList var1 = new ArrayList(var0.length);
         long[] var2 = var0;
         int var3 = var0.length;
         int var4 = x;

         do {
            if (var4 >= var3) {
               return var1;
            }

            long var5 = var2[var4];
            var1.add(var5);
            ++var4;
         } while(qZ < 0);

         throw null;
      }
   }

   // $FF: synthetic method
   static List<Byte> v(byte[] var0) {
      if (var0 == null) {
         return new ArrayList();
      } else {
         ArrayList var1 = new ArrayList(var0.length);
         byte[] var2 = var0;
         int var3 = var0.length;
         int var4 = d;

         do {
            if (var4 >= var3) {
               return var1;
            }

            byte var5 = var2[var4];
            var1.add(var5);
            ++var4;
         } while(!q);

         throw null;
      }
   }

   // $FF: synthetic method
   static List<Float> v(float[] var0) {
      if (var0 == null) {
         return new ArrayList();
      } else {
         ArrayList var1 = new ArrayList(var0.length);
         float[] var2 = var0;
         int var3 = var0.length;
         int var4 = kS;

         do {
            if (var4 >= var3) {
               return var1;
            }

            float var5 = var2[var4];
            var1.add(var5);
            ++var4;
         } while(qZ < 0);

         throw null;
      }
   }
}
