package l.M.x;

final class µµv extends µ8 {
   // $FF: synthetic field
   private final _µ_63 _;
   // $FF: synthetic field
   private final int µv8;
   // $FF: synthetic field
   private final int _µv;
   // $FF: synthetic field
   private int v_;
   // $FF: synthetic field
   private _v µ8_;
   // $FF: synthetic field
   private _v µ;
   // $FF: synthetic field
   private _v µ0;
   // $FF: synthetic field
   private _v µv;
   // $FF: synthetic field
   private _ v0;
   // $FF: synthetic field
   private static final int w;
   // $FF: synthetic field
   private static final int d;
   // $FF: synthetic field
   private static final int a;
   // $FF: synthetic field
   private static final int F;
   // $FF: synthetic field
   private static final int dV;

   // $FF: synthetic method
   public v v(String var1, boolean var2) {
      return var2 ? (this.µ8_ = l.M.x._v.v(this._, var1, this.µ8_)) : (this.µ = l.M.x._v.v(this._, var1, this.µ));
   }

   static {
      int var10001 = 1703893875;
      w = 2056609724 ^ U.o(1039808862);
      var10001 = -588858667;
      d = -1572329552 ^ U.o(1843663429);
      int var10002 = U.o(-1088542723);
      var10001 = -131781894;
      a = var10002 ^ -1075545859;
      var10002 = U.o(2067564126);
      var10001 = -467378165;
      F = var10002 ^ 2053192926;
      var10002 = U.N(1340775039, -95423733);
      var10001 = -1194841047;
      dV = (var10002 ^ U.o(-893413390)) & -1;
   }

   // $FF: synthetic method
   public v v(int var1, µ52 var2, String var3, boolean var4) {
      return var4 ? (this.µ0 = l.M.x._v.v(this._, var1, var2, var3, this.µ0)) : (this.µv = l.M.x._v.v(this._, var1, var2, var3, this.µv));
   }

   // $FF: synthetic method
   final void v(µv8 var1) {
      var1.v(this.v0);
   }

   // $FF: synthetic method
   µµv(_µ_63 var1, String var2, String var3, String var4) {
      super(w);
      this._ = var1;
      this.µv8 = var1._(var2);
      this._µv = var1._(var3);
      if (var4 != null) {
         this.v_ = var1._(var4);
      }

   }

   // $FF: synthetic method
   void v(_µv var1) {
      var1._v(this.µv8)._v(this._µv);
      int var2 = F;
      if (this.v_ != 0) {
         ++var2;
      }

      if (this.µ8_ != null) {
         ++var2;
      }

      if (this.µ != null) {
         ++var2;
      }

      if (this.µ0 != null) {
         ++var2;
      }

      if (this.µv != null) {
         ++var2;
      }

      if (this.v0 != null) {
         var2 += this.v0.µv8();
      }

      var1._v(var2);
      l.M.x._.v(this._, dV, this.v_, var1);
      l.M.x._v.v(this._, this.µ8_, this.µ, this.µ0, this.µv, var1);
      if (this.v0 != null) {
         this.v0.v(this._, var1);
      }

   }

   // $FF: synthetic method
   public void _v() {
   }

   // $FF: synthetic method
   public void v(_ var1) {
      var1._v = this.v0;
      this.v0 = var1;
   }

   // $FF: synthetic method
   int _() {
      int var1 = d;
      var1 += l.M.x._.v(this._, a, this.v_);
      var1 += l.M.x._v.v(this.µ8_, this.µ, this.µ0, this.µv);
      if (this.v0 != null) {
         var1 += this.v0.v(this._);
      }

      return var1;
   }
}
