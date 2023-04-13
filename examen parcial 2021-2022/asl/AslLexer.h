
// Generated from Asl.g4 by ANTLR 4.7.2

#pragma once


#include "antlr4-runtime.h"




class  AslLexer : public antlr4::Lexer {
public:
  enum {
    T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, 
    T__7 = 8, T__8 = 9, T__9 = 10, T__10 = 11, T__11 = 12, PAREOP = 13, 
    PARECL = 14, CLAUOP = 15, CLAUCL = 16, LT = 17, LE = 18, GT = 19, GE = 20, 
    ASSIGN = 21, EQUAL = 22, NOTEQUAL = 23, NOT = 24, AND = 25, OR = 26, 
    PLUS = 27, MINUS = 28, MUL = 29, DIV = 30, MOD = 31, VAR = 32, INT = 33, 
    BOOL = 34, CHAR = 35, FLOAT = 36, IF = 37, THEN = 38, ELSE = 39, ENDIF = 40, 
    WHILE = 41, DO = 42, ENDWHILE = 43, FUNC = 44, RETURN = 45, ENDFUNC = 46, 
    READ = 47, WRITE = 48, BOOLVAL = 49, INTVAL = 50, CHARVAL = 51, FLOATVAL = 52, 
    ID = 53, STRING = 54, COMMENT = 55, WS = 56
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

