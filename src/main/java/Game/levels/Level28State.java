package Game.levels;

import Game.*;
import Game.tiles.*;

public class Level28State extends Level {


    SolidTile t1 = new SolidTile(0, 0, tileSideLength, tileSideLength);
    SolidTile t2 = new SolidTile(tileSideLength, 0, tileSideLength, tileSideLength);
    SolidTile t3 = new SolidTile(tileSideLength * 2, 0, tileSideLength, tileSideLength);
    SolidTile t4 = new SolidTile(tileSideLength * 3, 0, tileSideLength, tileSideLength);
    SolidTile t5 = new SolidTile(tileSideLength * 4, 0, tileSideLength, tileSideLength);
    SolidTile t6 = new SolidTile(tileSideLength * 5, 0, tileSideLength, tileSideLength);
    SolidTile t7 = new SolidTile(tileSideLength * 6, 0, tileSideLength, tileSideLength);
    SolidTile t8 = new SolidTile(tileSideLength * 7, 0, tileSideLength, tileSideLength);
    SolidTile t9 = new SolidTile(tileSideLength * 8, 0, tileSideLength, tileSideLength);
    SolidTile t10 = new SolidTile(tileSideLength * 9, 0, tileSideLength, tileSideLength);
    SolidTile t11 = new SolidTile(tileSideLength * 10, 0, tileSideLength, tileSideLength);

    SolidTile t12 = new SolidTile(0, tileSideLength, tileSideLength, tileSideLength);
    SafeTile t13 = new SafeTile(tileSideLength, tileSideLength, tileSideLength, tileSideLength);
    RedElectricTile t14 = new RedElectricTile(tileSideLength * 2, tileSideLength, tileSideLength, tileSideLength, -1);
    SafeTile t15 = new SafeTile(tileSideLength * 3, tileSideLength, tileSideLength, tileSideLength);
    SolidTile t16 = new SolidTile(tileSideLength * 4, tileSideLength, tileSideLength, tileSideLength);
    SolidTile t17 = new SolidTile(tileSideLength * 5, tileSideLength, tileSideLength, tileSideLength);
    SolidTile t18 = new SolidTile(tileSideLength * 6, tileSideLength, tileSideLength, tileSideLength);
    SafeTile t19 = new SafeTile(tileSideLength * 7, tileSideLength, tileSideLength, tileSideLength);
    RedElectricTile t20 = new RedElectricTile(tileSideLength * 8, tileSideLength, tileSideLength, tileSideLength, -1);
    SafeTile t21 = new SafeTile(tileSideLength * 9, tileSideLength, tileSideLength, tileSideLength);
    SolidTile t22 = new SolidTile(tileSideLength * 10, tileSideLength, tileSideLength, tileSideLength);

    SolidTile t23 = new SolidTile(0, tileSideLength * 2, tileSideLength, tileSideLength);
    SafeTile t24 = new SafeTile(tileSideLength, tileSideLength * 2, tileSideLength, tileSideLength);
    RedElectricTile t25 = new RedElectricTile(tileSideLength * 2, tileSideLength * 2, tileSideLength, tileSideLength, -1);
    SafeTile t26 = new SafeTile(tileSideLength * 3, tileSideLength * 2, tileSideLength, tileSideLength);
    SolidTile t27 = new SolidTile(tileSideLength * 4, tileSideLength * 2, tileSideLength, tileSideLength);
    SolidTile t28 = new SolidTile(tileSideLength * 5, tileSideLength * 2, tileSideLength, tileSideLength);
    SolidTile t29 = new SolidTile(tileSideLength * 6, tileSideLength * 2, tileSideLength, tileSideLength);
    SafeTile t30 = new SafeTile(tileSideLength * 7, tileSideLength * 2, tileSideLength, tileSideLength);
    NextFloorTile t31 = new NextFloorTile(tileSideLength * 8, tileSideLength * 2, tileSideLength, tileSideLength);
    SafeTile t32 = new SafeTile(tileSideLength * 9, tileSideLength * 2, tileSideLength, tileSideLength);
    SolidTile t33 = new SolidTile(tileSideLength * 10, tileSideLength * 2, tileSideLength, tileSideLength);

    SolidTile t34 = new SolidTile(0, tileSideLength * 3, tileSideLength, tileSideLength);
    SafeTile t35 = new SafeTile(tileSideLength, tileSideLength * 3, tileSideLength, tileSideLength);
    RedElectricTile t36 = new RedElectricTile(tileSideLength * 2, tileSideLength * 3, tileSideLength, tileSideLength, -1);
    SafeTile t37 = new SafeTile(tileSideLength * 3, tileSideLength * 3, tileSideLength, tileSideLength);
    SolidTile t38 = new SolidTile(tileSideLength * 4, tileSideLength * 3, tileSideLength, tileSideLength);
    SolidTile t39 = new SolidTile(tileSideLength * 5, tileSideLength * 3, tileSideLength, tileSideLength);
    SolidTile t40 = new SolidTile(tileSideLength * 6, tileSideLength * 3, tileSideLength, tileSideLength);
    SafeTile t41 = new SafeTile(tileSideLength * 7, tileSideLength * 3, tileSideLength, tileSideLength);
    RedElectricTile t42 = new RedElectricTile(tileSideLength * 8, tileSideLength * 3, tileSideLength, tileSideLength, -1);
    SafeTile t43 = new SafeTile(tileSideLength * 9, tileSideLength * 3, tileSideLength, tileSideLength);
    SolidTile t44 = new SolidTile(tileSideLength * 10, tileSideLength * 3, tileSideLength, tileSideLength);

    SolidTile t45 = new SolidTile(0, tileSideLength * 4, tileSideLength, tileSideLength);
    SolidTile t46 = new SolidTile(tileSideLength, tileSideLength * 4, tileSideLength, tileSideLength);
    RedTile t47 = new RedTile(tileSideLength * 2, tileSideLength * 4, tileSideLength, tileSideLength);
    SolidTile t48 = new SolidTile(tileSideLength * 3, tileSideLength * 4, tileSideLength, tileSideLength);
    SolidTile t49 = new SolidTile(tileSideLength * 4, tileSideLength * 4, tileSideLength, tileSideLength);
    SolidTile t50 = new SolidTile(tileSideLength * 5, tileSideLength * 4, tileSideLength, tileSideLength);
    SolidTile t51 = new SolidTile(tileSideLength * 6, tileSideLength * 4, tileSideLength, tileSideLength);
    SolidTile t52 = new SolidTile(tileSideLength * 7, tileSideLength * 4, tileSideLength, tileSideLength);
    RedTile t53 = new RedTile(tileSideLength * 8, tileSideLength * 4, tileSideLength, tileSideLength);
    SolidTile t54 = new SolidTile(tileSideLength * 9, tileSideLength * 4, tileSideLength, tileSideLength);
    SolidTile t55 = new SolidTile(tileSideLength * 10, tileSideLength * 4, tileSideLength, tileSideLength);

    RedTile t56 = new RedTile(0, tileSideLength * 5, tileSideLength, tileSideLength);
    RedTile t57 = new RedTile(tileSideLength, tileSideLength * 5, tileSideLength, tileSideLength);
    RedTile t58 = new RedTile(tileSideLength * 2, tileSideLength * 5, tileSideLength, tileSideLength);
    RedTile t59 = new RedTile(tileSideLength * 3, tileSideLength * 5, tileSideLength, tileSideLength);
    RedTile t60 = new RedTile(tileSideLength * 4, tileSideLength * 5, tileSideLength, tileSideLength);
    SolidTile t61 = new SolidTile(tileSideLength * 5, tileSideLength * 5, tileSideLength, tileSideLength);
    RedTile t62 = new RedTile(tileSideLength * 6, tileSideLength * 5, tileSideLength, tileSideLength);
    RedTile t63 = new RedTile(tileSideLength * 7, tileSideLength * 5, tileSideLength, tileSideLength);
    RedTile t64 = new RedTile(tileSideLength * 8, tileSideLength * 5, tileSideLength, tileSideLength);
    RedTile t65 = new RedTile(tileSideLength * 9, tileSideLength * 5, tileSideLength, tileSideLength);
    RedTile t66 = new RedTile(tileSideLength * 10, tileSideLength * 5, tileSideLength, tileSideLength);

    RedElectricTile t67 = new RedElectricTile(0, tileSideLength * 6, tileSideLength, tileSideLength, -1);
    DoubleLCB t68 = new DoubleLCB(tileSideLength, tileSideLength * 6, tileSideLength, tileSideLength);
    DoubleLCB t69 = new DoubleLCB(tileSideLength * 2, tileSideLength * 6, tileSideLength, tileSideLength);
    DoubleLCB t70 = new DoubleLCB(tileSideLength * 3, tileSideLength * 6, tileSideLength, tileSideLength);
    RedElectricTile t71 = new RedElectricTile(tileSideLength * 4, tileSideLength * 6, tileSideLength, tileSideLength, -1);
    SolidTile t72 = new SolidTile(tileSideLength * 5, tileSideLength * 6, tileSideLength, tileSideLength);
    RedElectricTile t73 = new RedElectricTile(tileSideLength * 6, tileSideLength * 6, tileSideLength, tileSideLength, -1);
    LeftConveyerBelt t74 = new LeftConveyerBelt(tileSideLength * 7, tileSideLength * 6, tileSideLength, tileSideLength);
    DoubleLCB t75 = new DoubleLCB(tileSideLength * 8, tileSideLength * 6, tileSideLength, tileSideLength);
    DoubleLCB t76 = new DoubleLCB(tileSideLength * 9, tileSideLength * 6, tileSideLength, tileSideLength);
    RedElectricTile t77 = new RedElectricTile(tileSideLength * 10, tileSideLength * 6, tileSideLength, tileSideLength, -1);

    RedTile t78 = new RedTile(0, tileSideLength * 7, tileSideLength, tileSideLength);
    RedTile t79 = new RedTile(tileSideLength, tileSideLength * 7, tileSideLength, tileSideLength);
    RedTile t80 = new RedTile(tileSideLength * 2, tileSideLength * 7, tileSideLength, tileSideLength);
    RedTile t81 = new RedTile(tileSideLength * 3, tileSideLength * 7, tileSideLength, tileSideLength);
    RedTile t82 = new RedTile(tileSideLength * 4, tileSideLength * 7, tileSideLength, tileSideLength);
    SolidTile t83 = new SolidTile(tileSideLength * 5, tileSideLength * 7, tileSideLength, tileSideLength);
    RedTile t84 = new RedTile(tileSideLength * 6, tileSideLength * 7, tileSideLength, tileSideLength);
    RedTile t85 = new RedTile(tileSideLength * 7, tileSideLength * 7, tileSideLength, tileSideLength);
    RedTile t86 = new RedTile(tileSideLength * 8, tileSideLength * 7, tileSideLength, tileSideLength);
    RedTile t87 = new RedTile(tileSideLength * 9, tileSideLength * 7, tileSideLength, tileSideLength);
    RedTile t88 = new RedTile(tileSideLength * 10, tileSideLength * 7, tileSideLength, tileSideLength);

    RedElectricTile t89 = new RedElectricTile(0, tileSideLength * 8, tileSideLength, tileSideLength, -1);
    DoubleRCB t90 = new DoubleRCB(tileSideLength, tileSideLength * 8, tileSideLength, tileSideLength);
    DoubleRCB t91 = new DoubleRCB(tileSideLength * 2, tileSideLength * 8, tileSideLength, tileSideLength);
    RightConveyerBelt t92 = new RightConveyerBelt(tileSideLength * 3, tileSideLength * 8, tileSideLength, tileSideLength);
    RedElectricTile t93 = new RedElectricTile(tileSideLength * 4, tileSideLength * 8, tileSideLength, tileSideLength, -1);
    SolidTile t94 = new SolidTile(tileSideLength * 5, tileSideLength * 8, tileSideLength, tileSideLength);
    RedElectricTile t95 = new RedElectricTile(tileSideLength * 6, tileSideLength * 8, tileSideLength, tileSideLength, -1);
    DoubleRCB t96 = new DoubleRCB(tileSideLength * 7, tileSideLength * 8, tileSideLength, tileSideLength);
    DoubleRCB t97 = new DoubleRCB(tileSideLength * 8, tileSideLength * 8, tileSideLength, tileSideLength);
    DoubleRCB t98 = new DoubleRCB(tileSideLength * 9, tileSideLength * 8, tileSideLength, tileSideLength);
    RedElectricTile t99 = new RedElectricTile(tileSideLength * 10, tileSideLength * 8, tileSideLength, tileSideLength, -1);

    RedTile t100 = new RedTile(0, tileSideLength * 9, tileSideLength, tileSideLength);
    RedTile t101 = new RedTile(tileSideLength, tileSideLength * 9, tileSideLength, tileSideLength);
    RedTile t102 = new RedTile(tileSideLength * 2, tileSideLength * 9, tileSideLength, tileSideLength);
    RedTile t103 = new RedTile(tileSideLength * 3, tileSideLength * 9, tileSideLength, tileSideLength);
    RedTile t104 = new RedTile(tileSideLength * 4, tileSideLength * 9, tileSideLength, tileSideLength);
    SolidTile t105 = new SolidTile(tileSideLength * 5, tileSideLength * 9, tileSideLength, tileSideLength);
    RedTile t106 = new RedTile(tileSideLength * 6, tileSideLength * 9, tileSideLength, tileSideLength);
    RedTile t107 = new RedTile(tileSideLength * 7, tileSideLength * 9, tileSideLength, tileSideLength);
    RedTile t108 = new RedTile(tileSideLength * 8, tileSideLength * 9, tileSideLength, tileSideLength);
    RedTile t109 = new RedTile(tileSideLength * 9, tileSideLength * 9, tileSideLength, tileSideLength);
    RedTile t110 = new RedTile(tileSideLength * 10, tileSideLength * 9, tileSideLength, tileSideLength);

    RedElectricTile t111 = new RedElectricTile(0, tileSideLength * 10, tileSideLength, tileSideLength, -1);
    LeftConveyerBelt t112 = new LeftConveyerBelt(tileSideLength, tileSideLength * 10, tileSideLength, tileSideLength);
    LeftConveyerBelt t113 = new LeftConveyerBelt(tileSideLength * 2, tileSideLength * 10, tileSideLength, tileSideLength);
    LeftConveyerBelt t114 = new LeftConveyerBelt(tileSideLength * 3, tileSideLength * 10, tileSideLength, tileSideLength);
    RedElectricTile t115 = new RedElectricTile(tileSideLength * 4, tileSideLength * 10, tileSideLength, tileSideLength, -1);
    SolidTile t116 = new SolidTile(tileSideLength * 5, tileSideLength * 10, tileSideLength, tileSideLength);
    RedElectricTile t117 = new RedElectricTile(tileSideLength * 6, tileSideLength * 10, tileSideLength, tileSideLength, -1);
    LeftConveyerBelt t118 = new LeftConveyerBelt(tileSideLength * 7, tileSideLength * 10, tileSideLength, tileSideLength);
    LeftConveyerBelt t119 = new LeftConveyerBelt(tileSideLength * 8, tileSideLength * 10, tileSideLength, tileSideLength);
    LeftConveyerBelt t120 = new LeftConveyerBelt(tileSideLength * 9, tileSideLength * 10, tileSideLength, tileSideLength);
    RedElectricTile t121 = new RedElectricTile(tileSideLength * 10, tileSideLength * 10, tileSideLength, tileSideLength, -1);

    RedTile t122 = new RedTile(0, tileSideLength * 11, tileSideLength, tileSideLength);
    RedTile t123 = new RedTile(tileSideLength, tileSideLength * 11, tileSideLength, tileSideLength);
    RedTile t124 = new RedTile(tileSideLength * 2, tileSideLength * 11, tileSideLength, tileSideLength);
    RedTile t125 = new RedTile(tileSideLength * 3, tileSideLength * 11, tileSideLength, tileSideLength);
    RedTile t126 = new RedTile(tileSideLength * 4, tileSideLength * 11, tileSideLength, tileSideLength);
    RedTile t127 = new RedTile(tileSideLength * 5, tileSideLength * 11, tileSideLength, tileSideLength);
    RedTile t128 = new RedTile(tileSideLength * 6, tileSideLength * 11, tileSideLength, tileSideLength);
    RedTile t129 = new RedTile(tileSideLength * 7, tileSideLength * 11, tileSideLength, tileSideLength);
    RedTile t130 = new RedTile(tileSideLength * 8, tileSideLength * 11, tileSideLength, tileSideLength);
    RedTile t131 = new RedTile(tileSideLength * 9, tileSideLength * 11, tileSideLength, tileSideLength);
    RedTile t132 = new RedTile(tileSideLength * 10, tileSideLength * 11, tileSideLength, tileSideLength);

    RedTile t133 = new RedTile(0, tileSideLength * 12, tileSideLength, tileSideLength);
    RedTile t134 = new RedTile(tileSideLength, tileSideLength * 12, tileSideLength, tileSideLength);
    RedTile t135 = new RedTile(tileSideLength * 2, tileSideLength * 12, tileSideLength, tileSideLength);
    RightConveyerBelt t136 = new RightConveyerBelt(tileSideLength * 3, tileSideLength * 12, tileSideLength, tileSideLength);
    RightConveyerBelt t137 = new RightConveyerBelt(tileSideLength * 4, tileSideLength * 12, tileSideLength, tileSideLength);
    RightConveyerBelt t138 = new RightConveyerBelt(tileSideLength * 5, tileSideLength * 12, tileSideLength, tileSideLength);
    RightConveyerBelt t139 = new RightConveyerBelt(tileSideLength * 6, tileSideLength * 12, tileSideLength, tileSideLength);
    RightConveyerBelt t140 = new RightConveyerBelt(tileSideLength * 7, tileSideLength * 12, tileSideLength, tileSideLength);
    RedTile t141 = new RedTile(tileSideLength * 8, tileSideLength * 12, tileSideLength, tileSideLength);
    RedTile t142 = new RedTile(tileSideLength * 9, tileSideLength * 12, tileSideLength, tileSideLength);
    RedTile t143 = new RedTile(tileSideLength * 10, tileSideLength * 12, tileSideLength, tileSideLength);

    Pawn e1 = new Pawn(tileSideLength * 8, tileSideLength * 4, tileSideLength, tileSideLength);
    Pawn e2 = new Pawn(tileSideLength * 5, tileSideLength * 12, tileSideLength, tileSideLength);


    public Level28State() {
        super();

        widthInTiles = 11;
        heightInTiles = 13;
        tileSideLength = GameRunner.WINDOW_HEIGHT/ heightInTiles;

        finalTile = t31;

        manager.addObject(t1);
        manager.addObject(t2);
        manager.addObject(t3);
        manager.addObject(t4);
        manager.addObject(t5);
        manager.addObject(t6);
        manager.addObject(t7);
        manager.addObject(t8);
        manager.addObject(t9);
        manager.addObject(t10);
        manager.addObject(t11);
        manager.addObject(t12);
        manager.addObject(t13);
        manager.addObject(t14);
        manager.addObject(t15);
        manager.addObject(t16);
        manager.addObject(t17);
        manager.addObject(t18);
        manager.addObject(t19);
        manager.addObject(t20);
        manager.addObject(t21);
        manager.addObject(t22);
        manager.addObject(t23);
        manager.addObject(t24);
        manager.addObject(t25);
        manager.addObject(t26);
        manager.addObject(t27);
        manager.addObject(t28);
        manager.addObject(t29);
        manager.addObject(t30);
        manager.addObject(t31);
        manager.addObject(t32);
        manager.addObject(t33);
        manager.addObject(t34);
        manager.addObject(t35);
        manager.addObject(t36);
        manager.addObject(t37);
        manager.addObject(t38);
        manager.addObject(t39);
        manager.addObject(t40);
        manager.addObject(t41);
        manager.addObject(t42);
        manager.addObject(t43);
        manager.addObject(t44);
        manager.addObject(t45);
        manager.addObject(t46);
        manager.addObject(t47);
        manager.addObject(t48);
        manager.addObject(t49);
        manager.addObject(t50);
        manager.addObject(t51);
        manager.addObject(t52);
        manager.addObject(t53);
        manager.addObject(t54);
        manager.addObject(t55);
        manager.addObject(t56);
        manager.addObject(t57);
        manager.addObject(t58);
        manager.addObject(t59);
        manager.addObject(t60);
        manager.addObject(t61);
        manager.addObject(t62);
        manager.addObject(t63);
        manager.addObject(t64);
        manager.addObject(t65);
        manager.addObject(t66);
        manager.addObject(t67);
        manager.addObject(t68);
        manager.addObject(t69);
        manager.addObject(t70);
        manager.addObject(t71);
        manager.addObject(t72);
        manager.addObject(t73);
        manager.addObject(t74);
        manager.addObject(t75);
        manager.addObject(t76);
        manager.addObject(t77);
        manager.addObject(t78);
        manager.addObject(t79);
        manager.addObject(t80);
        manager.addObject(t81);
        manager.addObject(t82);
        manager.addObject(t83);
        manager.addObject(t84);
        manager.addObject(t85);
        manager.addObject(t86);
        manager.addObject(t87);
        manager.addObject(t88);
        manager.addObject(t89);
        manager.addObject(t90);
        manager.addObject(t91);
        manager.addObject(t92);
        manager.addObject(t93);
        manager.addObject(t94);
        manager.addObject(t95);
        manager.addObject(t96);
        manager.addObject(t97);
        manager.addObject(t98);
        manager.addObject(t99);
        manager.addObject(t100);
        manager.addObject(t101);
        manager.addObject(t102);
        manager.addObject(t103);
        manager.addObject(t104);
        manager.addObject(t105);
        manager.addObject(t106);
        manager.addObject(t107);
        manager.addObject(t108);
        manager.addObject(t109);
        manager.addObject(t110);
        manager.addObject(t111);
        manager.addObject(t112);
        manager.addObject(t113);
        manager.addObject(t114);
        manager.addObject(t115);
        manager.addObject(t116);
        manager.addObject(t117);
        manager.addObject(t118);
        manager.addObject(t119);
        manager.addObject(t120);
        manager.addObject(t121);
        manager.addObject(t122);
        manager.addObject(t123);
        manager.addObject(t124);
        manager.addObject(t125);
        manager.addObject(t126);
        manager.addObject(t127);
        manager.addObject(t128);
        manager.addObject(t129);
        manager.addObject(t130);
        manager.addObject(t131);
        manager.addObject(t132);
        manager.addObject(t133);
        manager.addObject(t134);
        manager.addObject(t135);
        manager.addObject(t136);
        manager.addObject(t137);
        manager.addObject(t138);
        manager.addObject(t139);
        manager.addObject(t140);
        manager.addObject(t141);
        manager.addObject(t142);
        manager.addObject(t143);

        manager.addObject(e1);
        manager.addObject(e2);

        manager.addObject(gp);
        manager.addObject(player);

    }


    public void updateLevel() {

        manager.update();
        manager.checkCollision(player, tileSideLength);
        winChecker();
        boundChecker();


        if (player.isAlive() == false) {
            gp.setX(tileSideLength * 2);
            gp.setY(tileSideLength * 2);


            player.setX(tileSideLength * 2);
            player.setY(tileSideLength * 2);

            e1.setX(tileSideLength * 8);
            e1.setY(tileSideLength * 4);

            e2.setX(tileSideLength * 5);
            e2.setY(tileSideLength * 12);

            manager.redTileReset();


            player.setAlive(true);

        }


    }


}
