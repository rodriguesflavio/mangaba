/* This file was generated by SableCC (http://www.sablecc.org/). */

package Mangaba.analysis;

import java.util.*;
import Mangaba.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecVar(ADecVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaNomes(AListaNomes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdListaNomes(AIdListaNomes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecFuncao(ADecFuncao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoRetorno(ATipoRetorno node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPVaziaParametros(APVaziaParametros node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParamsParametros(AParamsParametros node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParamParametros(AParamParametros node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParamParametro(AParamParametro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABloco(ABloco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaDec(AListaDec node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaListaDec(AListaListaDec node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaDecListaDec1(AListaDecListaDec1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecListaDec1(ADecListaDec1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaComando(AListaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaListaComando(AListaListaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaComListaComando1(AListaComListaComando1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoListaComando1(AComandoListaComando1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComando(AComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComSeComando(AComSeComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEnquantoComando(AEnquantoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParaComando(AParaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParaCadaComando(AParaCadaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAtribuicaoComando(AAtribuicaoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARetornoComando(ARetornoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAChComando(AChComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoSe(AComandoSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoSenao(AComandoSenao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoEnquanto(AComandoEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoPara(AComandoPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoParaCada(AComandoParaCada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAuxPara(AAuxPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAP1ListaPontoVirgula(AP1ListaPontoVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAP2ListaPontoVirgula(AP2ListaPontoVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAuxParaCada(AAuxParaCada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAI1ListaId(AI1ListaId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAI2ListaId(AI2ListaId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAtrib(AAtrib node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariavelTipadaAtrib(AVariavelTipadaAtrib node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaAtrib(AListaAtrib node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAtribListaAtrib(AAtribListaAtrib node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARetorno(ARetorno node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVar(AVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExprVar(AExprVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIntTipoBase(AIntTipoBase node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACaracterTipoBase(ACaracterTipoBase node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABoolTipoBase(ABoolTipoBase node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARTipoBase(ARTipoBase node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoEsp(ATipoEsp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARealTipoEsp(ARealTipoEsp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACaractTipoEsp(ACaractTipoEsp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABoolTipoEsp(ABoolTipoEsp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipo(ATipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVetorTipo(AVetorTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpr(AExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOprsExpr(AOprsExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAChamExpr(AChamExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFatorOperadores(AFatorOperadores node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOpAdiOperadores(AOpAdiOperadores node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOpRelOperadores(AOpRelOperadores node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOpBoolOperadores(AOpBoolOperadores node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOpRel(AOpRel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorQOpRel(AMenorQOpRel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaiorQOpRel(AMaiorQOpRel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaiorIgualOpRel(AMaiorIgualOpRel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorIgualOpRel(AMenorIgualOpRel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOpAdi(AOpAdi node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenosOpAdi(AMenosOpAdi node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOpMul(AOpMul node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivisaoOpMul(ADivisaoOpMul node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOpBool(AOpBool node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOuOpBool(AOuOpBool node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANaoOpBool(ANaoOpBool node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermoFator(ATermoFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOpMulFator(AOpMulFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumeroTermo(ANumeroTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarTermo(AVarTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExprTermo(AExprTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAChamada(AChamada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaExp(AListaExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaListaExp(AListaListaExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpListaExp(AExpListaExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAdicao(TAdicao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSubtracao(TSubtracao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMultiplicacao(TMultiplicacao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDivisao(TDivisao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenor(TMenor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaior(TMaior node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenorIgual(TMenorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaiorIgual(TMaiorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIgual(TIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiferente(TDiferente node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAtribuicao(TAtribuicao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNao(TNao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTE(TE node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOu(TOu node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVirgula(TVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDoispontos(TDoispontos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPontoevirgula(TPontoevirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPonto(TPonto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTresPontos(TTresPontos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAbreparenteses(TAbreparenteses node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFechaparenteses(TFechaparenteses node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAbrecolchetes(TAbrecolchetes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFechacolchetes(TFechacolchetes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAbrechaves(TAbrechaves node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFechachaves(TFechachaves node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBarra(TBarra node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInteiro(TInteiro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInteiroLiteral(TInteiroLiteral node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaractere(TCaractere node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaractereLiteral(TCaractereLiteral node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReal(TReal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRealLiteral(TRealLiteral node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBooleano(TBooleano node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBoolLiteral(TBoolLiteral node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVazio(TVazio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEnquanto(TEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPara(TPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTParacada(TParacada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSe(TSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSenao(TSenao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInicio(TInicio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFim(TFim node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRetorne(TRetorne node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVetor(TVetor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIdentificador(TIdentificador node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumero(TNumero node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
