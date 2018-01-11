/* This file was generated by SableCC (http://www.sablecc.org/). */

package Mangaba.analysis;

import Mangaba.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseADecVar(ADecVar node);
    void caseAListaNomes(AListaNomes node);
    void caseAIdListaNomes(AIdListaNomes node);
    void caseADecFuncao(ADecFuncao node);
    void caseATipoRetorno(ATipoRetorno node);
    void caseAPVaziaParametros(APVaziaParametros node);
    void caseAParamsParametros(AParamsParametros node);
    void caseAParamParametros(AParamParametros node);
    void caseAParamParametro(AParamParametro node);
    void caseABloco(ABloco node);
    void caseAListaDec(AListaDec node);
    void caseAListaListaDec(AListaListaDec node);
    void caseAListaDecListaDec1(AListaDecListaDec1 node);
    void caseADecListaDec1(ADecListaDec1 node);
    void caseAListaComando(AListaComando node);
    void caseAListaListaComando(AListaListaComando node);
    void caseAListaComListaComando1(AListaComListaComando1 node);
    void caseAComandoListaComando1(AComandoListaComando1 node);
    void caseAComando(AComando node);
    void caseAComSeComando(AComSeComando node);
    void caseAEnquantoComando(AEnquantoComando node);
    void caseAParaComando(AParaComando node);
    void caseAParaCadaComando(AParaCadaComando node);
    void caseAAtribuicaoComando(AAtribuicaoComando node);
    void caseARetornoComando(ARetornoComando node);
    void caseAChComando(AChComando node);
    void caseAComandoSe(AComandoSe node);
    void caseAComandoSenao(AComandoSenao node);
    void caseAComandoEnquanto(AComandoEnquanto node);
    void caseAComandoPara(AComandoPara node);
    void caseAComandoParaCada(AComandoParaCada node);
    void caseAAuxPara(AAuxPara node);
    void caseAP1ListaPontoVirgula(AP1ListaPontoVirgula node);
    void caseAP2ListaPontoVirgula(AP2ListaPontoVirgula node);
    void caseAAuxParaCada(AAuxParaCada node);
    void caseAI1ListaId(AI1ListaId node);
    void caseAI2ListaId(AI2ListaId node);
    void caseAAtrib(AAtrib node);
    void caseAVariavelTipadaAtrib(AVariavelTipadaAtrib node);
    void caseAListaAtrib(AListaAtrib node);
    void caseAAtribListaAtrib(AAtribListaAtrib node);
    void caseARetorno(ARetorno node);
    void caseAVar(AVar node);
    void caseAExprVar(AExprVar node);
    void caseAIntTipoBase(AIntTipoBase node);
    void caseACaracterTipoBase(ACaracterTipoBase node);
    void caseABoolTipoBase(ABoolTipoBase node);
    void caseARTipoBase(ARTipoBase node);
    void caseATipoEsp(ATipoEsp node);
    void caseARealTipoEsp(ARealTipoEsp node);
    void caseACaractTipoEsp(ACaractTipoEsp node);
    void caseABoolTipoEsp(ABoolTipoEsp node);
    void caseATipo(ATipo node);
    void caseAVetorTipo(AVetorTipo node);
    void caseAExpr(AExpr node);
    void caseAOprsExpr(AOprsExpr node);
    void caseAChamExpr(AChamExpr node);
    void caseAFatorOperadores(AFatorOperadores node);
    void caseAOpAdiOperadores(AOpAdiOperadores node);
    void caseAOpRelOperadores(AOpRelOperadores node);
    void caseAOpBoolOperadores(AOpBoolOperadores node);
    void caseAOpRel(AOpRel node);
    void caseAMenorQOpRel(AMenorQOpRel node);
    void caseAMaiorQOpRel(AMaiorQOpRel node);
    void caseAMaiorIgualOpRel(AMaiorIgualOpRel node);
    void caseAMenorIgualOpRel(AMenorIgualOpRel node);
    void caseAOpAdi(AOpAdi node);
    void caseAMenosOpAdi(AMenosOpAdi node);
    void caseAOpMul(AOpMul node);
    void caseADivisaoOpMul(ADivisaoOpMul node);
    void caseAOpBool(AOpBool node);
    void caseAOuOpBool(AOuOpBool node);
    void caseANaoOpBool(ANaoOpBool node);
    void caseATermoFator(ATermoFator node);
    void caseAOpMulFator(AOpMulFator node);
    void caseANumeroTermo(ANumeroTermo node);
    void caseAVarTermo(AVarTermo node);
    void caseAExprTermo(AExprTermo node);
    void caseAChamada(AChamada node);
    void caseAListaExp(AListaExp node);
    void caseAListaListaExp(AListaListaExp node);
    void caseAExpListaExp(AExpListaExp node);

    void caseTAdicao(TAdicao node);
    void caseTSubtracao(TSubtracao node);
    void caseTMultiplicacao(TMultiplicacao node);
    void caseTDivisao(TDivisao node);
    void caseTMenor(TMenor node);
    void caseTMaior(TMaior node);
    void caseTMenorIgual(TMenorIgual node);
    void caseTMaiorIgual(TMaiorIgual node);
    void caseTIgual(TIgual node);
    void caseTDiferente(TDiferente node);
    void caseTAtribuicao(TAtribuicao node);
    void caseTNao(TNao node);
    void caseTE(TE node);
    void caseTOu(TOu node);
    void caseTVirgula(TVirgula node);
    void caseTDoispontos(TDoispontos node);
    void caseTPontoevirgula(TPontoevirgula node);
    void caseTPonto(TPonto node);
    void caseTTresPontos(TTresPontos node);
    void caseTAbreparenteses(TAbreparenteses node);
    void caseTFechaparenteses(TFechaparenteses node);
    void caseTAbrecolchetes(TAbrecolchetes node);
    void caseTFechacolchetes(TFechacolchetes node);
    void caseTAbrechaves(TAbrechaves node);
    void caseTFechachaves(TFechachaves node);
    void caseTBarra(TBarra node);
    void caseTInteiro(TInteiro node);
    void caseTInteiroLiteral(TInteiroLiteral node);
    void caseTCaractere(TCaractere node);
    void caseTCaractereLiteral(TCaractereLiteral node);
    void caseTReal(TReal node);
    void caseTRealLiteral(TRealLiteral node);
    void caseTBooleano(TBooleano node);
    void caseTBoolLiteral(TBoolLiteral node);
    void caseTVazio(TVazio node);
    void caseTEnquanto(TEnquanto node);
    void caseTPara(TPara node);
    void caseTParacada(TParacada node);
    void caseTSe(TSe node);
    void caseTSenao(TSenao node);
    void caseTInicio(TInicio node);
    void caseTFim(TFim node);
    void caseTRetorne(TRetorne node);
    void caseTVetor(TVetor node);
    void caseTIdentificador(TIdentificador node);
    void caseTNumero(TNumero node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
