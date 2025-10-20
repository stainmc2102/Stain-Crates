package l.M.x;

import java.util.Map;

public class v2v4 extends vv7µ {
   // $FF: synthetic field
   public String _µ6;
   // $FF: synthetic field
   public String __;
   // $FF: synthetic field
   public String v_5;
   // $FF: synthetic field
   public boolean _72;
   // $FF: synthetic field
   private static boolean I;
   // $FF: synthetic field
   private static final int W;
   // $FF: synthetic field
   private static final int l;
   // $FF: synthetic field
   private static final int j;
   // $FF: synthetic field
   private static final int O;

   // $FF: synthetic method
   public int _v() {
      return O;
   }

   static {
      int var10002 = U.o(2016796328);
      int var10001 = 201183136;
      W = var10002 ^ 360426663;
      var10001 = 1241219352;
      l = -1425033905 ^ -1425033906;
      var10002 = U.o(-324971853);
      var10001 = -620958478;
      j = var10002 ^ -850754249;
      var10001 = 1622986030;
      O = 416566766 ^ U.o(-676189416);
   }

   // $FF: synthetic method
   public void v(int var1) {
      this.µ5 = var1;
   }

   // $FF: synthetic method
   public v2v4(int var1, String var2, String var3, String var4, boolean var5) {
      super(var1);
      this._µ6 = var2;
      this.__ = var3;
      this.v_5 = var4;
      this._72 = var5;
   }

   // $FF: synthetic method
   public vv7µ v(Map<v_21, v_21> var1) {
      return (new v2v4(this.µ5, this._µ6, this.__, this.v_5, this._72)).v((vv7µ)this);
   }

   // $FF: synthetic method
   public void v(_µ6 var1) {
      var1.v(this.µ5, this._µ6, this.__, this.v_5, this._72);
      this._v(var1);
   }

   // $FF: synthetic method
   public v2v4(int var1, String var2, String var3, String var4) {
      int var10005;
      if (var1 == W) {
         var10005 = l;
         if (!I) {
            throw null;
         }
      } else {
         var10005 = j;
      }

      this(var1, var2, var3, var4, (boolean)var10005);
   }
}
