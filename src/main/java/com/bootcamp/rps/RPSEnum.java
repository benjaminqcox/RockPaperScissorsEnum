package com.bootcamp.rps;


public enum RPSEnum {
    ROCK {
        @Override
        public ResultEnum getResult(RPSEnum other) {
            if (other == ROCK) return ResultEnum.DRAW;
            else if (other == PAPER) return ResultEnum.LOSE;
            return ResultEnum.WIN;
        }
    },
    PAPER {
        @Override
        public ResultEnum getResult(RPSEnum other) {
            if (other == PAPER) return ResultEnum.DRAW;
            else if (other == SCISSORS) return ResultEnum.LOSE;
            return ResultEnum.WIN;
        }
    },
    SCISSORS {
        @Override
        public ResultEnum getResult(RPSEnum other) {
            if (other == SCISSORS) return ResultEnum.DRAW;
            else if (other == ROCK) return ResultEnum.LOSE;
            return ResultEnum.WIN;
        }
    };
    
    public abstract ResultEnum getResult(RPSEnum other);
}
