package wwe;

import wwe.utils.*;
import java.util.*;
import wwe.modules.gui.*;
import java.awt.*;

public class ohwW
{
    public qMIe lJcE;
    public FinI rhHA;
    public int yQtC;
    public ArrayList<kUUQ> znxP;
    public boolean xecA;
    public boolean fzNA;
    
    public ohwW(final qMIe lJcE, final FinI rhHA, final int yQtC) {
        super();
        this.znxP = new ArrayList<kUUQ>();
        this.lJcE = lJcE;
        this.rhHA = rhHA;
        this.yQtC = yQtC;
        int n = yQtC + 12;
        for (final IcRI icRI : Client.tiEw) {
            if (icRI.lJZv != lJcE) {
                continue;
            }
            if (icRI.dTln() && !icRI.geCg) {
                this.znxP.add(new nzoK((ModeValue)icRI, this, n));
                n += 12;
            }
            if (icRI.MATs() && !icRI.geCg) {
                this.znxP.add(new uQsp((NumberValue)icRI, this, n));
                n += 12;
            }
            if (icRI.wnpo() && !icRI.geCg) {
                this.znxP.add(new RwuA((BooleanValue)icRI, this, n));
                n += 12;
            }
            if (!icRI.bsGi() || icRI.geCg) {
                continue;
            }
            this.znxP.add(new kmYZ((BBeR)icRI, this, n));
            n += 12;
        }
        this.znxP.add(new IhNF(this, n));
        n += 12;
        this.znxP.add(new BiVj(this, lJcE, n));
        n += 12;
        this.znxP.add(new XwHe(this, n, "https://wweclient.com/documentation/modules/" + this.lJcE.czUH().replaceAll(" ", "") + ".php"));
    }
    
    public void kUCc(final int n, final int n2, final float n3) {
        boolean xecA;
        if (n > this.rhHA.kVnf && n < this.rhHA.kVnf + this.rhHA.dedb && n2 > this.rhHA.CQIZ + this.yQtC - 1 && n2 < this.rhHA.CQIZ + 12 + this.yQtC && this.rhHA.iWnD) {
            xecA = true;
            }
        }
        else {
            xecA = false;
        }
        this.xecA = xecA;
        final float n4 = (float)this.rhHA.kVnf;
        final float n5 = (float)(this.rhHA.CQIZ + this.yQtC);
        final float n6 = (float)(this.rhHA.kVnf + this.rhHA.dedb);
        final float n7 = (float)(this.rhHA.CQIZ + this.yQtC + 12);
        int n8;
        if (this.xecA) {
            if (this.lJcE.IuiN()) {
                n8 = new Color(Client.hNxW.qHPF((Class<Gui>)PAPd.class).red.OnGi().intValue(), Client.hNxW.qHPF((Class<Gui>)PAPd.class).green.OnGi().intValue(), Client.hNxW.qHPF((Class<Gui>)PAPd.class).blue.OnGi().intValue()).getRGB();
            }
            else {
                n8 = new Color(15, 15, 15, 245).getRGB();
            }
        }
        else if (this.lJcE.IuiN()) {
            n8 = new Color(Client.hNxW.qHPF((Class<Gui>)PAPd.class).red.OnGi().intValue(), Client.hNxW.qHPF((Class<Gui>)PAPd.class).green.OnGi().intValue(), Client.hNxW.qHPF((Class<Gui>)PAPd.class).blue.OnGi().intValue()).darker().getRGB();
            }
        }
        else {
            n8 = new Color(15, 15, 15, 215).getRGB();
        }
        gnNa.wQYt(n4, n5, n6, n7, n8);
        final String czUH = this.lJcE.czUH();
        final float n9 = (float)(this.rhHA.kVnf + 3);
        final float n10 = (float)(this.rhHA.CQIZ + this.yQtC + 2);
        int n11;
        if (this.lJcE.IuiN()) {
            n11 = -1;
            }
        }
        else {
            n11 = -1;
        }
        XybC.eTim(czUH, n9, n10, n11);
        if (this.fzNA) {
            for (final kUUQ kuuq : this.znxP) {
                kuuq.JyWl(n, n2, n3);
                kuuq.QdjS(n, n2);
            }
        }
    }
    
    public void PFLg(final double n, final double n2, final int n3) {
        if (this.xecA) {
            this.lJcE.GDVp();
        }
        if (this.xecA && n3 == 1) {
            boolean fzNA;
            if (!this.fzNA) {
                fzNA = true;
            }
            else {
                fzNA = false;
            }
            this.fzNA = fzNA;
        }
        if (this.fzNA && this.rhHA.iWnD) {
            final Iterator<kUUQ> iterator = this.znxP.iterator();
            while (iterator.hasNext()) {
                iterator.next().rVom((int)n, (int)n2, n3);
            }
        }
    }
    
    public void EDua(final double n, final double n2, final int n3) {
        if (this.fzNA) {
            final Iterator<kUUQ> iterator = this.znxP.iterator();
            while (iterator.hasNext()) {
                iterator.next().XrGT((int)n, (int)n2, n3);
            }
        }
    }
    
    public void WRUj(final int n) {
        if (this.fzNA) {
            final Iterator<kUUQ> iterator = this.znxP.iterator();
            while (iterator.hasNext()) {
                iterator.next().WwPa(n);
            }
        }
    }
    
    public void XBgs(final double n) {
    }
}
