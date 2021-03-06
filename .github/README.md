# MinesweeperAndroid
A streamlined implementation of the classic game, made with Android Studio. Continued from https://github.com/Curdflappers/Minesweeper, this implementation doesn't drain battery!

**Current elements**

- Customize difficulty (rows, columns, mines)

- Toast messages on game completion

- Long click to do opposite action

- Clicking revealed spot automatically reveals neighbors if safe

- Timer tracks game time

- First sweep is always safe

- Can't place any more flags than necessary

- Preset difficulties

- High score tracker

- Music and sound effects

- Support device rotation

**Currently in development**

- Save games/preferences between sessions

**Roadmap**

v1.0
- Better user configurations
  - Drag a slider and get a preview of the spot size without manually editing rows, cols
  - Choose minefield density instead of mine count

v1.1
- Autosolver!
  - Watch a computer solve the field

- Hints
  - Use autosolver functionality to request help whenever you're stuck

v1.2
- More flags!
  - Use multiple flag colors to match your playstyle
  
- Hide the status bar
  - Make your entire screen a minefield with no distractions!
  
v1.3
- Different game modes!
  - Infinite Sweeper: Field gets denser as you venture from the center
  - No-Flag Mode: Challenge yourself by clearing the field without flags
  - Valley Sweeper: Fixed number of rows, start at the left and work your way down infinite columns
