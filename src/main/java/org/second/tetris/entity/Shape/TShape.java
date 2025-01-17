package org.second.tetris.entity.Shape;

import org.second.tetris.utils.TetrisColor;

/**
 * T形状的方块
 *
 * @author 吴晓鹏
 * @version 1.0
 */
public class TShape extends Tetromino {
    public TShape() {
        cells[0] = new Cell(4, 18, TetrisColor.T);
        cells[1] = new Cell(5, 18, TetrisColor.T);
        cells[2] = new Cell(6, 18, TetrisColor.T);
        cells[3] = new Cell(5, 19, TetrisColor.T);
    }

    @Override
    //Todo:Tshap的spin方法待测试
    public void spin() {
        Cell center = cells[1];
        for (Cell cell : cells) {
            cell.spin(center);
        }
    }
}
