
// Generated from Asl.g4 by ANTLR 4.7.2

#pragma once


#include "antlr4-runtime.h"




class  AslLexer : public antlr4::Lexer {
public:
  enum {
    T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, EXCL = 7, 
    PAREOP = 8, PARECL = 9, CLAUOP = 10, CLAUCL = 11, LT = 12, LE = 13, 
    GT = 14, GE = 15, ASSIGN = 16, EQUAL = 17, NOTEQUAL = 18, NOT = 19, 
    AND = 20, OR = 21, PLUS = 22, MINUS = 23, MUL = 24, DIV = 25, MOD = 26, 
    VAR = 27, BASIC_TYPE = 28, INT = 29, BOOL = 30, CHAR = 31, FLOAT = 32, 
    IF = 33, THEN = 34, ELSE = 35, ENDIF = 36, WHILE = 37, DO = 38, ENDWHILE = 39, 
    FUNC = 40, RETURN = 41, ENDFUNC = 42, READ = 43, WRITE = 44, BOOLVAL = 45, 
    INTVAL = 46, FLOATVAL = 47, CHARVAL = 48, ID = 49, STRING = 50, COMMENT = 51, 
    WS = 52
  };

  AslLexer(antlr4::CharStream *input);
  ~AslLexer();

  virtual std::string getGrammarFileName() const override;
  virtual const std::vector<std::string>& getRuleNames() const override;

  virtual const std::vector<std::string>& getChannelNames() const override;
  virtual const std::vector<std::string>& getModeNames() const override;
  virtual const std::vector<std::string>& getTokenNames() const override; // deprecated, use vocabulary instead
  virtual antlr4::dfa::Vocabulary& getVocabulary() const override;

  virtual const std::vector<uint16_t> getSerializedATN() const override;
  virtual const antlr4::atn::ATN& getATN() const override;

private:
  static std::vector<antlr4::dfa::DFA> _decisionToDFA;
  static antlr4::atn::PredictionContextCache _sharedContextCache;
  static std::vector<std::string> _ruleNames;
  static std::vector<std::string> _tokenNames;
  static std::vector<std::string> _channelNames;
  static std::vector<std::string> _modeNames;

  static std::vector<std::string> _literalNames;
  static std::vector<std::string> _symbolicNames;
  static antlr4::dfa::Vocabulary _vocabulary;
  static antlr4::atn::ATN _atn;
  static std::vector<uint16_t> _serializedATN;


  // Individual action functions triggered by action() above.

  // Individual semantic predicate functions triggered by sempred() above.

  struct Initializer {
    Initializer();
  };
  static Initializer _init;
};

