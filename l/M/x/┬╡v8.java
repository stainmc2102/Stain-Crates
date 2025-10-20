package l.M.x;

final class µv8 {
   // $FF: synthetic field
   private static final int v = 6;
   // $FF: synthetic field
   private int _v;
   // $FF: synthetic field
   private _[] _;
   // $FF: synthetic field
   private static int y;
   // $FF: synthetic field
   private static final int X;
   // $FF: synthetic field
   private static final int F;
   // $FF: synthetic field
   private static final int r;
   // $FF: synthetic field
   private static final int c;
   // $FF: synthetic field
   private static final int q;
   // $FF: synthetic field
   private static final int b;
   // $FF: synthetic field
   private static final int O;
   // $FF: synthetic field
   private static final int p;
   // $FF: synthetic field
   private static final int V;
   // $FF: synthetic field
   private static final int d;

   // $FF: synthetic method
   void v(_ var1) {
      _ var2 = var1;

      do {
         if (var2 == null) {
            return;
         }

         if (!this._v(var2)) {
            this._(var2);
         }

         var2 = var2._v;
      } while(y >= 0);

      throw null;
   }

   // $FF: synthetic method
   private boolean _v(_ var1) {
      int var2 = c;

      do {
         if (var2 >= this._v) {
            return (boolean)b;
         }

         if (this._[var2].v.equals(var1.v)) {
            return (boolean)q;
         }

         ++var2;
      } while(y >= 0);

      throw null;
   }

   // $FF: synthetic method
   _[] v() {
      _[] var1 = new _[this._v];
      System.arraycopy(this._, F, var1, r, this._v);
      return var1;
   }

   // $FF: synthetic method
   µv8() {
      this._ = new _[X];
   }

   // $FF: synthetic method
   private void _(_ var1) {
      if (this._v >= this._.length) {
         _[] var2 = new _[this._.length + O];
         System.arraycopy(this._, p, var2, V, this._v);
         this._ = var2;
      }

      _[] var10000 = this._;
      int var10003 = this._v;
      this._v = var10003 + d;
      var10000[var10003] = var1;
   }

   static {
      int var10002 = U.o(616415677);
      int var10001 = -2001560722;
      X = var10002 ^ -1115439838;
      var10002 = U.o(301444390);
      var10001 = -1519866601;
      F = var10002 ^ U.N(-250833219, 2035490869);
      var10002 = U.o(-1458130918);
      var10001 = 1448020079;
      r = var10002 ^ 1477273749;
      var10002 = U.o(779655581);
      var10001 = 613647789;
      c = var10002 ^ U.N(979160207, 1301244183);
      q = 524288 >>> U.o(-889192448) | 524288 << -211;
      var10002 = U.o(-1728123226);
      var10001 = 1675634261;
      b = (var10002 ^ 1702330137) & -1;
      O = 25165824 >>> 86 | 25165824 << ~U.o(1778384896) + 1;
      var10002 = U.o(-1441300870);
      var10001 = 1599414201;
      p = var10002 ^ 1585375317;
      var10002 = U.o(902765261);
      var10001 = 1144266786;
      V = (var10002 ^ -1286016084) & -1;
      var10002 = U.o(-1790360244);
      var10001 = 487624782;
      d = (var10002 ^ 849515176) & -1;
   }
}
