package l.M.x;

import java.util.Map;

public class v_21 extends vv7µ {
   // $FF: synthetic field
   private µ_ _µ6;
   // $FF: synthetic field
   private static final int E;
   // $FF: synthetic field
   private static final int g;
   // $FF: synthetic field
   private static final int C;

   // $FF: synthetic method
   public v_21(µ_ var1) {
      super(g);
      this._µ6 = var1;
   }

   // $FF: synthetic method
   public int _v() {
      return C;
   }

   static {
      int var10002 = U.o(848641936);
      int var10001 = 2001931007;
      E = var10002 ^ -167553357;
      var10001 = -799488739;
      g = 1894292978 ^ -1894292979;
      C = 1073741824 >>> U.o(-570425344) | 1073741824 << ~U.N(125952, 298484714) + 1;
   }

   // $FF: synthetic method
   public void v(_µ6 var1) {
      var1.v(this._µv());
   }

   // $FF: synthetic method
   public µ_ _µv() {
      if (this._µ6 == null) {
         this._µ6 = new µ_();
      }

      return this._µ6;
   }

   // $FF: synthetic method
   public void v_() {
      this._µ6 = null;
   }

   // $FF: synthetic method
   public v_21() {
      super(E);
   }

   // $FF: synthetic method
   public vv7µ v(Map<v_21, v_21> var1) {
      return (vv7µ)var1.get(this);
   }
}
