package l.M.x;

final class _6v_v1 {
   // $FF: synthetic field
   final µ_ v;
   // $FF: synthetic field
   final µ_ _v;
   // $FF: synthetic field
   final µ_ _;
   // $FF: synthetic field
   final int µv8;
   // $FF: synthetic field
   final String _µv;
   // $FF: synthetic field
   _6v_v1 v_;
   // $FF: synthetic field
   private static int Q;
   // $FF: synthetic field
   private static boolean Z;
   // $FF: synthetic field
   private static final int v7 = -3 >>> 34 | -3 << ~34 + 1;
   // $FF: synthetic field
   private static final int r;
   // $FF: synthetic field
   private static final int M;
   // $FF: synthetic field
   private static final int Py;

   static {
      int var10002 = U.N(-1239397130, -1085871960);
      int var10001 = 1731092297;
      r = var10002 ^ U.o(839150959);
      M = 4096 >>> U.N(5472, 749873157) | 4096 << ~U.o(-721420288) + 1;
      Py = 1 >>> 29 | 1 << ~U.N(7424, 174419688) + 1;
   }

   // $FF: synthetic method
   _6v_v1(µ_ var1, µ_ var2, µ_ var3, int var4, String var5) {
      this.v = var1;
      this._v = var2;
      this._ = var3;
      this.µv8 = var4;
      this._µv = var5;
   }

   // $FF: synthetic method
   _6v_v1(_6v_v1 var1, µ_ var2, µ_ var3) {
      this(var2, var3, var1._, var1.µv8, var1._µv);
      this.v_ = var1.v_;
   }

   // $FF: synthetic method
   static int v(_6v_v1 var0) {
      int var1 = r;
      _6v_v1 var2 = var0;

      do {
         if (var2 == null) {
            return var1;
         }

         ++var1;
         var2 = var2.v_;
      } while(Q < 0);

      throw null;
   }

   // $FF: synthetic method
   static int _v(_6v_v1 var0) {
      return M + Py * v(var0);
   }

   // $FF: synthetic method
   static void v(_6v_v1 var0, _µv var1) {
      var1._v(v(var0));
      _6v_v1 var2 = var0;

      do {
         if (var2 == null) {
            return;
         }

         var1._v(var2.v.µ5)._v(var2._v.µ5)._v(var2._.µ5)._v(var2.µv8);
         var2 = var2.v_;
      } while(!Z);

      throw null;
   }

   // $FF: synthetic method
   static _6v_v1 v(_6v_v1 var0, µ_ var1, µ_ var2) {
      if (var0 == null) {
         return null;
      } else {
         var0.v_ = v(var0.v_, var1, var2);
         int var3 = var0.v.µ5;
         int var4 = var0._v.µ5;
         int var5 = var1.µ5;
         int var10000;
         if (var2 == null) {
            var10000 = v7;
            if (Z) {
               throw null;
            }
         } else {
            var10000 = var2.µ5;
         }

         int var6 = var10000;
         if (var5 < var4 && var6 > var3) {
            if (var5 <= var3) {
               return var6 >= var4 ? var0.v_ : new _6v_v1(var0, var2, var0._v);
            } else if (var6 >= var4) {
               return new _6v_v1(var0, var0.v, var1);
            } else {
               var0.v_ = new _6v_v1(var0, var2, var0._v);
               return new _6v_v1(var0, var0.v, var1);
            }
         } else {
            return var0;
         }
      }
   }
}
